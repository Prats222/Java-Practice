package Stringsui;

import java.util.*;

public class basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "pratsdongunda";
        String gtr = " bhaddu";
        // contains method
        System.out.println(str.contains("gnda"));

        // startswith and endswiith
        System.out.println(str.startsWith("pra"));
        System.out.println(str.endsWith("gunda"));

        // lowercase,uppercase, concat
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.concat(gtr));
    }
}
