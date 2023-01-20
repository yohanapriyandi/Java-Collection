package ardhastudio.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("first", "Fathar");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("midle", "Dhabit");
        Map<String, String> imutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "satu", "Fathar",
                "dua", "Dhabit",
                "tiga", "Adz-dzaky",
                "empat", "Fariq",
                "lima", "Taqy",
                "enam", "Abqori",
                "tujuh", "Tsabita",
                "delapan", "Uswah",
                "sembilan", "Karimah"
        );

        // map.put("bum", "bum");// error
    }
}
