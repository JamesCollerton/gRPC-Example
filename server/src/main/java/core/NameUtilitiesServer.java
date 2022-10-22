package core;

import services.NameUtilitiesGrpc;

public final class NameUtilitiesServer extends NameUtilitiesGrpc.NameUtilitiesImplBase {

  @Override
  public void getNameByPrefix(
      services.Prefix request, io.grpc.stub.StreamObserver<services.Name> responseObserver) {
    responseObserver.onNext(NameUtilitiesHelper.getNameByPrefix(request));
    responseObserver.onCompleted();
  }
}
