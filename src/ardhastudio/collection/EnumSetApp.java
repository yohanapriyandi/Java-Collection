package ardhastudio.collection;

import java.util.EnumSet;

public class EnumSetApp {

    public static enum Gender{
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        // menampilkan semua data pada class gender

        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        // menampilkan data pada class Gender satu persatu gunakan Gender.of()
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);
        for (var gender : genders){
            System.out.println(gender);
        }
    }
}
