package core;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/*
   This class creates the gRPC server that accepts requests
*/
public class GrpcServer {

  private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

  /*
   Specify the port, here we also pass the class we have
   created (NameUtilitiesServer) to the server in order
   to register the functionality.
  */
  private final int port = 8080;
  private final Server server =
      ServerBuilder.forPort(port).addService(new NameUtilitiesServer()).build();

  /*
   This starts the server and provides the instructions for
   what to do when the runtime exits.
  */
  public void start() throws IOException {
    server.start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                () -> {
                  System.err.println("Shutting down gRPC server since JVM is shutting down");
                  try {
                    GrpcServer.this.stop();
                  } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                  }
                  System.err.println("server shut down");
                }));
  }

  /*
   Both of these helper methods are used to gracefully
   deal with the gRPC running.
  */

  public void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  public void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }
}
