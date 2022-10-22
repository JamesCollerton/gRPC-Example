package core;

import services.NameUtilitiesGrpc;

public final class NameUtilitiesService extends NameUtilitiesGrpc.NameUtilitiesImplBase {

  NameUtilitiesService() {
    System.out.println("Making service");
  }

  @Override
  public void getNameByPrefix(
      services.Prefix request, io.grpc.stub.StreamObserver<services.Name> responseObserver) {
    responseObserver.onNext(NameUtilitiesHelper.getNameByPrefix(request));
    responseObserver.onCompleted();
  }
}
