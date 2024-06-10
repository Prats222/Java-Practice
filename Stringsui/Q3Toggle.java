//Q.) Toggle all chars of string , convert all uppercase to lower and vice versa.

package Stringsui;

import java.util.*;

public class Q3Toggle {
    public static void main(String[] args) {
        // to find asci value of character -
        // char ch = str.charAt(i);
        // int asci = (int)ch;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // for input of stringbuilder = StringBuilder str = new
        // StringBuilder(sc.nextLine());
        StringBuilder gtr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                gtr.append(Character.toLowerCase(c));
            } else {
                gtr.append(Character.toUpperCase(c));
            }
        }
        System.out.println(gtr);
    }
}
