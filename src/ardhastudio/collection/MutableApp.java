package ardhastudio.collection;

import ardhastudio.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Yohan");
        person.addHobby("Coding");
        person.addHobby("Jualan");
        person.addHobby("Basket");
        person.addHobby("Kuliner");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // ini sebuah contoh muttable list
        // dimana data di List bisa dirubah di luar method main
        // idealnya data di dalam List terutama yang bersifat sensitif tidak bisa diubah
        hobbies.add("badung badung");
    }
}
