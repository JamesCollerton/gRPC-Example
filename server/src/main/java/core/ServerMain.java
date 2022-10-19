package core;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerMain {

    private static final Logger logger = Logger.getLogger(ServerMain.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer grpcServer = new GrpcServer();
        grpcServer.start();
        grpcServer.blockUntilShutdown();
    }

}
