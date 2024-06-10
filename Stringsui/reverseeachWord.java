package Stringsui;
//reversee each word of a sentence

//approach -
// take string
//take a stringbuilder , store a word in it.
// reverse the word.

//Push the reversed word with a space in a new string called "ANS".
import java.util.*;

public class reverseeachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = ""; // To store reversed words
        StringBuilder revers = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                revers.append(ch);
            } else { // ch= ' '
                revers.reverse(); // if space detected then first reverse the word then push to ANS.
                ans += revers + " ";

                revers.delete(0, revers.length());

                // all this will work till 2nd last elemnt, last elemnt element will not be
                // added to ans because there is no next space.
                // It will remain in revers function.
            }
        }
        revers.reverse(); // the last word remaining in fncn is reversed then added to ANS.
        ans += revers;
        System.out.println(ans);
    }
}
