package com.yoda.creditCard.services;

import com.yoda.creditCard.CreditCard;
import com.yoda.creditCard.CreditCardReply;
import com.yoda.creditCard.CreditCardRequest;
import com.yoda.creditCard.CreditCardsGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.TimeUnit;

@GrpcService
public class CreditCardImpl extends CreditCardsGrpc.CreditCardsImplBase {

    @Override
    public void getCreditCards(CreditCardRequest request, StreamObserver<CreditCardReply> responseObserver) {
        try {
            TimeUnit.MILLISECONDS.sleep(640);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CreditCard creditCardGold = CreditCard.newBuilder()
                .setId(Double.valueOf(Math.random()*100000).longValue())
                .setTitle("Gold")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setValue(200)
                .setFlag("ELO")
                .build();

        CreditCard creditCardPlatinum = CreditCard.newBuilder()
                .setId(Double.valueOf(Math.random()*100000).longValue())
                .setTitle("Platinum")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setValue(300)
                .setFlag("VISA")
                .build();

        CreditCard creditCardBlack = CreditCard.newBuilder()
                .setId(Double.valueOf(Math.random()*100000).longValue())
                .setTitle("Black")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setValue(400)
                .setFlag("Mastercard")
                .build();

        CreditCardReply reply = CreditCardReply.newBuilder()
                .addCreditCard(creditCardGold)
                .addCreditCard(creditCardPlatinum)
                .addCreditCard(creditCardBlack)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();

    }
}
