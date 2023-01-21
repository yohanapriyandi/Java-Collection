package ardhastudio.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Fathar", "Dhabit", "Adz-dzaky");

        Object[] objects = names.toArray();
        // genericnya
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
