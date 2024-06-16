package PracticeString;
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

import java.util.Arrays;

public class anagram {
    public static String sort(String str) {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static boolean isAnagram(String s, String t) {
        return s.length() == t.length() && sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
