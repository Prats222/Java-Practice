package PracticeString;

import java.util.*;

public class RemoveVowelAndSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();

        char[] ch = { 'a', 'e', 'i', 'o', 'u' };
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            boolean isVowel = false;
            for (char v : ch) {
                if (c == v) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel)
                ans.append(c);
        }
        System.out.println(ans.toString().trim());
    }
}
