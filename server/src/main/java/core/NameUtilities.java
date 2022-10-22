package core;

import services.Name;
import services.Prefix;

import java.util.List;
import java.util.Optional;

public class NameUtilities {

  private static final List<String> names =
      List.of("Abigail", "Berta", "Catherine", "Debbie", "James", "Jack", "Xavier");

  public static Name getNameByPrefix(Prefix prefix) {
    Optional<Name> nameOptional =
        names.stream()
            .filter(name -> name.startsWith(prefix.getPrefix()))
            .map(name -> Name.newBuilder().setName(name).build())
            .findFirst();
    return nameOptional.orElse(Name.newBuilder().build());
  }
}
