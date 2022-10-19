import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerMain {

    private static final Logger logger = Logger.getLogger(ServerMain.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerExample serverExample = new ServerExample();
        serverExample.start();
        serverExample.blockUntilShutdown();
    }

}
