package ardhastudio.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Yohan", "Apriyandi", "Ardha", "Studio"));
        Collections.sort(list);

        for (var value : list){
            System.out.println(value);
        }
    }
}
