package Stringsui;

import java.util.*;

public class substrin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Substring(i,j) is continuous part of a string.
        // str=abcd , - a,ab,abc ,abcd are substring. b a is not possible as its not
        // continuous. b , bc, bcd , c , cd, d are substrings.

        String str = "abcde";
        System.out.println(str.substring(0, 3)); // it will print 0 to n-1 ,i.e, 0 to 2. // output = abc.

        System.out.println(str.substring(2)); // this will print from 2 to end. // cde

        // Question.

        String str2 = "abcd";
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i + 1; j < str2.length() + 1; j++) { // length+1 because while taking substring we have to take
                                                              // 0,1, 1,2, 2,3,3,4 and last element is not rpinted , n-1
                                                              // is printed, so for last eleent of str2 we need to use
                                                              // length+1.

                System.out.print(str2.substring(i, j) + " ");
            }
        }
    }
}
