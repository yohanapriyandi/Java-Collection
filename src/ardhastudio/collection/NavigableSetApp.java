package ardhastudio.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Yohan", "Apriyandi", "Fithriya", "Nabilah", "Fathar", "Dhabit", "Adz-dzaky"));

        // untuk mengurutkan data secara descending lita bisa menggunakan method descendingSet()
        NavigableSet<String> nameReversed = names.descendingSet();

        // mengambil sebagian data implementasi method headset()
        NavigableSet<String> fathar = names.headSet("Fathar", true);
        NavigableSet<String> fathar2 = names.tailSet("Fathar", true);

        for (var name :  names){
            System.out.println(name);
        }

        // NavigableSet tidak bisa dimodifikasi
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("wow");
    }
}
