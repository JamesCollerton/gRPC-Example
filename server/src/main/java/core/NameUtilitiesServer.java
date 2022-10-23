package core;

import services.NameUtilitiesGrpc;

/*
 This is the server that implements the service class
 we declared in our proto file.
*/
public final class NameUtilitiesServer extends NameUtilitiesGrpc.NameUtilitiesImplBase {

  /*
   Here we override the service method we declared, using
   it to call our underlying utility methods
  */
  @Override
  public void getNameByPrefix(
      services.Prefix request, io.grpc.stub.StreamObserver<services.Name> responseObserver) {
    responseObserver.onNext(NameUtilitiesHelper.getNameByPrefix(request));
    responseObserver.onCompleted();
  }
}
