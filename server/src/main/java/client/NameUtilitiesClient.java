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
  private final NameUtilitiesGrpc.NameUtilitiesStub asyncStub;

  /** Construct client for accessing RouteGuide server using the existing channel. */
  public NameUtilitiesClient(Channel channel) {
    blockingStub = NameUtilitiesGrpc.newBlockingStub(channel);
    asyncStub = NameUtilitiesGrpc.newStub(channel);
  }

  public void getNameByPrefix(String prefix) {
    System.out.println("Hello!");

    //    Point request = Point.newBuilder().setLatitude(lat).setLongitude(lon).build();

    //    Feature feature;
    try {
      Name name = blockingStub.getNameByPrefix(Prefix.newBuilder().setPrefix(prefix).build());
      System.out.println(name.getName());
      //      if (testHelper != null) {
      //        testHelper.onMessage(feature);
      //      }
    } catch (StatusRuntimeException e) {
      System.out.println("Done");
    }
    //    if (RouteGuideUtil.exists(feature)) {
    //      info("Found feature called \"{0}\" at {1}, {2}",
    //              feature.getName(),
    //              RouteGuideUtil.getLatitude(feature.getLocation()),
    //              RouteGuideUtil.getLongitude(feature.getLocation()));
    //    } else {
    //      info("Found no feature at {0}, {1}",
    //              RouteGuideUtil.getLatitude(feature.getLocation()),
    //              RouteGuideUtil.getLongitude(feature.getLocation()));
    //    }
  }

  public static void main(String[] args) throws InterruptedException {
    String target = "localhost:8080";
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
    try {
      NameUtilitiesClient client = new NameUtilitiesClient(channel);
      // Looking for a valid feature
      client.getNameByPrefix("A");
    } finally {
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
