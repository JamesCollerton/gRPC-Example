package core;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import services.Name;
import services.NameUtilities;
import services.Prefix;

public class NameUtilitiesServer implements NameUtilities.Interface {
  @Override
  public void getNameByPrefix(RpcController controller, Prefix request, RpcCallback<Name> done) {
    done.run(NameUtilitiesHelper.getNameByPrefix(request));
  }
}
