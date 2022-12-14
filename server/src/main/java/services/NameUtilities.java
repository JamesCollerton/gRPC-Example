// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: name_utilities.proto

package services;

/**
 * Protobuf service {@code nameutilities.NameUtilities}
 */
public  abstract class NameUtilities
    implements com.google.protobuf.Service {
  protected NameUtilities() {}

  public interface Interface {
    /**
     * <code>rpc GetNameByPrefix(.nameutilities.Prefix) returns (.nameutilities.Name);</code>
     */
    public abstract void getNameByPrefix(
        com.google.protobuf.RpcController controller,
        services.Prefix request,
        com.google.protobuf.RpcCallback<services.Name> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new NameUtilities() {
      @java.lang.Override
      public  void getNameByPrefix(
          com.google.protobuf.RpcController controller,
          services.Prefix request,
          com.google.protobuf.RpcCallback<services.Name> done) {
        impl.getNameByPrefix(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.getNameByPrefix(controller, (services.Prefix)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return services.Prefix.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return services.Name.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc GetNameByPrefix(.nameutilities.Prefix) returns (.nameutilities.Name);</code>
   */
  public abstract void getNameByPrefix(
      com.google.protobuf.RpcController controller,
      services.Prefix request,
      com.google.protobuf.RpcCallback<services.Name> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return services.NameUtilitiesProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.getNameByPrefix(controller, (services.Prefix)request,
          com.google.protobuf.RpcUtil.<services.Name>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return services.Prefix.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return services.Name.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends services.NameUtilities implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void getNameByPrefix(
        com.google.protobuf.RpcController controller,
        services.Prefix request,
        com.google.protobuf.RpcCallback<services.Name> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        services.Name.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          services.Name.class,
          services.Name.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public services.Name getNameByPrefix(
        com.google.protobuf.RpcController controller,
        services.Prefix request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public services.Name getNameByPrefix(
        com.google.protobuf.RpcController controller,
        services.Prefix request)
        throws com.google.protobuf.ServiceException {
      return (services.Name) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        services.Name.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:nameutilities.NameUtilities)
}

