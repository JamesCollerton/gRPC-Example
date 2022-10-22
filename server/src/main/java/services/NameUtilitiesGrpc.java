package services;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: nameutilities.proto")
public class NameUtilitiesGrpc {

  private NameUtilitiesGrpc() {}

  public static final String SERVICE_NAME = "nameutilities.NameUtilities";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<services.Prefix,
      services.Name> METHOD_GET_NAME_BY_PREFIX =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "nameutilities.NameUtilities", "GetNameByPrefix"),
          io.grpc.protobuf.ProtoUtils.marshaller(services.Prefix.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(services.Name.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameUtilitiesStub newStub(io.grpc.Channel channel) {
    return new NameUtilitiesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameUtilitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NameUtilitiesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NameUtilitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NameUtilitiesFutureStub(channel);
  }

  /**
   */
  public static abstract class NameUtilitiesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNameByPrefix(services.Prefix request,
        io.grpc.stub.StreamObserver<services.Name> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_NAME_BY_PREFIX, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_NAME_BY_PREFIX,
            asyncUnaryCall(
              new MethodHandlers<
                services.Prefix,
                services.Name>(
                  this, METHODID_GET_NAME_BY_PREFIX)))
          .build();
    }
  }

  /**
   */
  public static final class NameUtilitiesStub extends io.grpc.stub.AbstractStub<NameUtilitiesStub> {
    private NameUtilitiesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameUtilitiesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameUtilitiesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameUtilitiesStub(channel, callOptions);
    }

    /**
     */
    public void getNameByPrefix(services.Prefix request,
        io.grpc.stub.StreamObserver<services.Name> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_NAME_BY_PREFIX, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NameUtilitiesBlockingStub extends io.grpc.stub.AbstractStub<NameUtilitiesBlockingStub> {
    private NameUtilitiesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameUtilitiesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameUtilitiesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameUtilitiesBlockingStub(channel, callOptions);
    }

    /**
     */
    public services.Name getNameByPrefix(services.Prefix request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_NAME_BY_PREFIX, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NameUtilitiesFutureStub extends io.grpc.stub.AbstractStub<NameUtilitiesFutureStub> {
    private NameUtilitiesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NameUtilitiesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameUtilitiesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NameUtilitiesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<services.Name> getNameByPrefix(
        services.Prefix request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_NAME_BY_PREFIX, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME_BY_PREFIX = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NameUtilitiesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(NameUtilitiesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAME_BY_PREFIX:
          serviceImpl.getNameByPrefix((services.Prefix) request,
              (io.grpc.stub.StreamObserver<services.Name>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_NAME_BY_PREFIX);
  }

}
