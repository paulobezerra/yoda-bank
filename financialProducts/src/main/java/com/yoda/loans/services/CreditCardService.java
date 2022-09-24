package com.yoda.loans.services;

import com.yoda.creditCard.CreditCardReply;
import com.yoda.creditCard.CreditCardRequest;
import com.yoda.creditCard.CreditCardsGrpc;
import com.yoda.loans.entities.Product;
import com.yoda.loans.entities.ProductTypeEnum;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CreditCardService {
    public List<Product> getCreditCards(String userId) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();

        CreditCardsGrpc.CreditCardsBlockingStub stub = CreditCardsGrpc.newBlockingStub(channel);


        CreditCardReply creditCards = stub.getCreditCards(CreditCardRequest.newBuilder().setUserId(userId).build());

        return creditCards.getCreditCardList().stream().map(cc -> (new Product())
                .setId(cc.getId())
                .setType(ProductTypeEnum.CREDIT_CARD)
                .setTitle(cc.getTitle())
                .setDescription(cc.getDescription())
                .setValue(BigDecimal.valueOf(cc.getValue()))).toList();
    }
}
