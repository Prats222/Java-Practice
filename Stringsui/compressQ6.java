package Stringsui;
// aaabbbbccddde , output - a3b4c2d3e

//String should be compressed in a way that duplicates are replaced with no of consecutive duplicates of the char.

import java.util.*;

public class compressQ6 {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        String ans = " " + str.charAt(0);
        int count = 1; // ans has the first index already

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i); // comparing next and prev element.
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1)
                    ans += count;// count is added so that we dont get output as e1.
                // add the count to ans next to pushed element.
                count = 1; // make it again 1 count the new element
                ans += curr; // again add the next first element.
            }

        }
        if (count > 1)
            ans += count; // for last element
        System.out.println(ans);
    }
}
