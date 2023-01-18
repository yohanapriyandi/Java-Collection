package ardhastudio.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> satu = Collections.singletonList("Satu");
        List<String> kosong = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Yohan");
        mutable.add("Apriyandi");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> e = List.of("Fathar", "Dhabit", "Adz-dzaky");

        for (var value : e){
            System.out.println(value);
        }

    }
}
