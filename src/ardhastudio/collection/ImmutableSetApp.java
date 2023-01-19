package ardhastudio.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> singleton = Collections.singleton("Yohan");

        Set<String> mutable = new HashSet<>();
        mutable.add("Yohan");
        mutable.add("Apriyandi");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Fahar", "Dhabit","Adz-zaky");
    }
}
