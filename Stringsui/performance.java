package Stringsui;

import java.util.*;

public class performance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str += i + " "; // the string is not directly formed like 12345678910 , it is formed like "1",
                            // "12" , "123" ..... each having its own memory, so performance very bad in
                            // strings of java.
            // imporved using string builder.
        }
        System.out.println(str);

        // str.equals() method
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1 == s2); // true because it checks address same or not, not the actual value

        // if we check s1==s3 , it will give false , as address is diff.

        System.out.println(s1.equals(s3)); // true it check value.
    }
}
