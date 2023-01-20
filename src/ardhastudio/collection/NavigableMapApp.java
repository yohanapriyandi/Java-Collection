package ardhastudio.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Yohan", "Yohan");
        map.put("Nabila", "Nabila");
        map.put("Fathar", "Fathar");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("Kurang dari");
        System.out.println(map.lowerKey("Nabila"));
        System.out.println("Lebih dari");
        System.out.println(map.lowerKey("Nabila"));
        System.out.println("Lebih dari sama dengan");
        System.out.println(map.floorKey("Dudut"));
        System.out.println("Kurang dari sama dengan");
        System.out.println(map.ceilingKey("Dudut"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> imutable = Collections.unmodifiableNavigableMap(map);
        //imutable.put("Bum", "bum");//error

    }
}
