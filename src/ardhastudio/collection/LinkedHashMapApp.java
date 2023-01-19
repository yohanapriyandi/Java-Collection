package ardhastudio.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Fathar");
        map.put("middle", "Dhabit");
        map.put("last", "Adz-dzaky");

        Set<String> keys = map.keySet();
        for (var key : keys){
            System.out.println(key);
        }
    }
}
