package Stringsui;

import java.util.*;

public class stringintchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str += "def";
        str += 22; // its converted to string and gets added.
        System.out.println(str);

        System.out.println("abc" + "x" + 22 + 10); // abcx2210
        System.out.println(22 + 10 + "abc" + "x"); // 30abcx
    }
}
