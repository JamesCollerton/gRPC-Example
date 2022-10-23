package core;

import java.io.IOException;

/*
 Main entryway into the program where we start up our GRPC Server
*/
public class ServerMain {

  public static void main(String[] args) throws IOException, InterruptedException {
    /*
     Start up the server which we have declared
    */
    GrpcServer grpcServer = new GrpcServer();
    grpcServer.start();
    grpcServer.blockUntilShutdown();
  }
}
