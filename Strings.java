import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String first = "Prats";
        String last = "Mishra";
        String fullname = first + last;

        System.out.println(fullname.length());

        // charat
        // for (int i = 0; i < fullname.length(); i++) {
        // System.out.println(fullname.charAt(i));
        // }

        // comparison of strings
        if (first.compareTo(last) == 0) {
            System.out.println("Equal strings");
        } else {
            System.out.println("not equal");
        }

        // substring
        String sentence = " My name is Prats";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}
