package client;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import services.Name;
import services.NameUtilitiesGrpc;
import services.Prefix;

import java.util.concurrent.TimeUnit;

/*
 This class represents a client, which would use a stub to contact
 the server (if it was running on a different machine) For the sake
 of example we've put both the client and server in the same project,
 but there's no reason why you couldn't publish your stubs to an
 artifactory and use them in separate projects.
*/
public class NameUtilitiesClient {

  /*
  Blocking stub to make calls to our client
  */
  private final NameUtilitiesGrpc.NameUtilitiesBlockingStub blockingStub;

  public NameUtilitiesClient(Channel channel) {
    blockingStub = NameUtilitiesGrpc.newBlockingStub(channel);
  }

  /*
   Function for using our defined service. Takes in a prefix and
   using the stub calls the function on the server, printing the
   answer
  */
  public void getNameByPrefix(String prefix) {
    System.out.println("Retrieving name with prefix " + prefix);
    try {
      Name name = blockingStub.getNameByPrefix(Prefix.newBuilder().setPrefix(prefix).build());
      System.out.println("Retrieved name with prefix " + name.getName());
    } catch (StatusRuntimeException e) {
      System.out.println("Done");
    }
  }

  /*
   Method to run our stub. Notice we pass the same port we
   defined our server running on.
  */
  public static void main(String[] args) throws InterruptedException {
    String target = "localhost:8080";
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
    try {
      NameUtilitiesClient client = new NameUtilitiesClient(channel);
      client.getNameByPrefix("A");
    } finally {
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
