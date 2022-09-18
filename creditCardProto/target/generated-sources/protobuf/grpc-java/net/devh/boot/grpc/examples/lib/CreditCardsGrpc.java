package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: .proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CreditCardsGrpc {

  private CreditCardsGrpc() {}

  public static final String SERVICE_NAME = "net.devh.boot.grpc.example.CreditCards";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.CreditCardRequest,
      net.devh.boot.grpc.examples.lib.CreditCardReply> getGetCreditCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCreditCards",
      requestType = net.devh.boot.grpc.examples.lib.CreditCardRequest.class,
      responseType = net.devh.boot.grpc.examples.lib.CreditCardReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.CreditCardRequest,
      net.devh.boot.grpc.examples.lib.CreditCardReply> getGetCreditCardsMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.CreditCardRequest, net.devh.boot.grpc.examples.lib.CreditCardReply> getGetCreditCardsMethod;
    if ((getGetCreditCardsMethod = CreditCardsGrpc.getGetCreditCardsMethod) == null) {
      synchronized (CreditCardsGrpc.class) {
        if ((getGetCreditCardsMethod = CreditCardsGrpc.getGetCreditCardsMethod) == null) {
          CreditCardsGrpc.getGetCreditCardsMethod = getGetCreditCardsMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.CreditCardRequest, net.devh.boot.grpc.examples.lib.CreditCardReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCreditCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.CreditCardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.CreditCardReply.getDefaultInstance()))
              .setSchemaDescriptor(new CreditCardsMethodDescriptorSupplier("getCreditCards"))
              .build();
        }
      }
    }
    return getGetCreditCardsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreditCardsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreditCardsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreditCardsStub>() {
        @java.lang.Override
        public CreditCardsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreditCardsStub(channel, callOptions);
        }
      };
    return CreditCardsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreditCardsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreditCardsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreditCardsBlockingStub>() {
        @java.lang.Override
        public CreditCardsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreditCardsBlockingStub(channel, callOptions);
        }
      };
    return CreditCardsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreditCardsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreditCardsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreditCardsFutureStub>() {
        @java.lang.Override
        public CreditCardsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreditCardsFutureStub(channel, callOptions);
        }
      };
    return CreditCardsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CreditCardsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCreditCards(net.devh.boot.grpc.examples.lib.CreditCardRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.CreditCardReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCreditCardsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCreditCardsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.CreditCardRequest,
                net.devh.boot.grpc.examples.lib.CreditCardReply>(
                  this, METHODID_GET_CREDIT_CARDS)))
          .build();
    }
  }

  /**
   */
  public static final class CreditCardsStub extends io.grpc.stub.AbstractAsyncStub<CreditCardsStub> {
    private CreditCardsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreditCardsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreditCardsStub(channel, callOptions);
    }

    /**
     */
    public void getCreditCards(net.devh.boot.grpc.examples.lib.CreditCardRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.CreditCardReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCreditCardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreditCardsBlockingStub extends io.grpc.stub.AbstractBlockingStub<CreditCardsBlockingStub> {
    private CreditCardsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreditCardsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreditCardsBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.devh.boot.grpc.examples.lib.CreditCardReply getCreditCards(net.devh.boot.grpc.examples.lib.CreditCardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCreditCardsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreditCardsFutureStub extends io.grpc.stub.AbstractFutureStub<CreditCardsFutureStub> {
    private CreditCardsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreditCardsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreditCardsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.CreditCardReply> getCreditCards(
        net.devh.boot.grpc.examples.lib.CreditCardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCreditCardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CREDIT_CARDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreditCardsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreditCardsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CREDIT_CARDS:
          serviceImpl.getCreditCards((net.devh.boot.grpc.examples.lib.CreditCardRequest) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.CreditCardReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CreditCardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreditCardsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreditCards");
    }
  }

  private static final class CreditCardsFileDescriptorSupplier
      extends CreditCardsBaseDescriptorSupplier {
    CreditCardsFileDescriptorSupplier() {}
  }

  private static final class CreditCardsMethodDescriptorSupplier
      extends CreditCardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CreditCardsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreditCardsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreditCardsFileDescriptorSupplier())
              .addMethod(getGetCreditCardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
