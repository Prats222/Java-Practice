package Stringsui;
//Q.4 ) return count of plaindromic substrings from a given String S

import java.util.*;

public class palindromicSubstrin {
    public static void main(String[] args) {
        // code to check palindrome.

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String reversedStr = new StringBuilder(str).reverse().toString();

        // if (str.equals(reversedStr)) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        // sc.close();

        // actual ques -
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countu = countss(s);
        System.out.println(countu);

    }

    private static int countss(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPali(s.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPali(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
