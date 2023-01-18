package ardhastudio.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // data yang ada pada hashset tidak menjamin data bakal terurut
        // Set<String> names = new HashSet<>();
        // data yang ada pada LinkedHashset menjamin data bakal terurut
        Set<String> names = new LinkedHashSet<>();
        names.add("fathar");
        names.add("dhabit");
        names.add("adz-dzaky");
        names.add("fathar");
        names.add("dhabit");
        names.add("adz-dzaky");

        for (var value : names){
            System.out.println(value);
        }
    }
}
