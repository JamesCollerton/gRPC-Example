package client;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import services.Name;
import services.NameUtilitiesGrpc;
import services.Prefix;

import java.util.concurrent.TimeUnit;

public class NameUtilitiesClient {

  private final NameUtilitiesGrpc.NameUtilitiesBlockingStub blockingStub;

  /** Construct client for accessing RouteGuide server using the existing channel. */
  public NameUtilitiesClient(Channel channel) {
    blockingStub = NameUtilitiesGrpc.newBlockingStub(channel);
  }

  public void getNameByPrefix(String prefix) {
    System.out.println("Retrieving name with prefix " + prefix);
    try {
      Name name = blockingStub.getNameByPrefix(Prefix.newBuilder().setPrefix(prefix).build());
      System.out.println("Retrieved name with prefix " + name.getName());
    } catch (StatusRuntimeException e) {
      System.out.println("Done");
    }
  }

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
