package ardhastudio.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        // untuk menampilkan data ke dalam list kita bisa menggunakan arraylist atau linked list
        // semua method di arraylist bisak digunakan juga di linkedlist
        // karena du method di atas (arraylist dan linkedlist) turunan dari collection()
        List<String> strings = new ArrayList<>();
        //List<String> strings = new LinkedList<>();

        // add() untuk menambah data
        strings.add("Fathar");
        strings.add("Dhabit");
        strings.add("Adz-Dzaky");
        strings.add("Yohan Apriyandi");
        // set() untuk merubah data
        strings.set(3, "Abiena Fathar");
        // remove untuk menghapus data
        strings.remove(2);
        System.out.println(strings.get(1));

        for (var value : strings){
            System.out.println(value);
        }

    }

}
