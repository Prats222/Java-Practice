package Stringsui;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        // character arr is called string.
        // char[] arr= new char[10];

        // String str = "prats";
        // System.out.println(str);

        // input taking
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String gtr = "hello";
        System.out.println(str);

        // charAt and length()
        int len = str.length();
        System.out.println(len);

        System.out.println(str.charAt(6));

        // indexOf and compareTo()
        System.out.println(str.indexOf("d"));// if multiple d then gives first d's
        // index

        System.out.println(str.compareTo(gtr));
    }
}
