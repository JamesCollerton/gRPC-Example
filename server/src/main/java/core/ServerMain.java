package core;

import java.io.IOException;

public class ServerMain {

  public static void main(String[] args) throws IOException, InterruptedException {
    GrpcServer grpcServer = new GrpcServer();
    grpcServer.start();
    grpcServer.blockUntilShutdown();
  }
}
