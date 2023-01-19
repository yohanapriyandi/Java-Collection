package ardhastudio.collection;

import ardhastudio.collection.data.Person;
import ardhastudio.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        // apabila kita menggunakan library atau kelas yang dibuat oleh orang lain
        // dan kita ingin menggunakan comparable() maka kita diharuskan membuat comparator class
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Yohan"));
        people.add(new Person("Nabila"));
        people.add(new Person("Fathar"));

        // data ang dihasilkan oleh sortedset akan terurut secara ascending
        // apabila kitak ingin mengurutkan secara descendiing kita tinggal tambahkan method reversed()
        for (var person : people){
            System.out.println(person.getName());
        }

        // untuk membuat agar Sorted tidak bisa dimanipulasi
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("Dhabit"));
    }
}
