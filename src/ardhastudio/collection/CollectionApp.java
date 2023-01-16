package ardhastudio.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Yohan");
        collection.add("Apriyandi");
        collection.addAll(List.of("Ardha", "Studio"));

        for (var value : collection){
            System.out.println(value );
        }

        System.out.println("Remove");

        collection.remove("Apriyandi");
        collection.removeAll(List.of("Ardha", "Studio"));

        for (var value : collection){
            System.out.println(value );
        }

        System.out.println(
                collection.contains("Fathar")
        );

        System.out.println(
                collection.containsAll(List.of("Yohan"))
        );

    }
}
