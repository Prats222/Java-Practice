package PracticeString;

import java.util.Arrays;
import java.util.Scanner;

public class sortStringofchars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hmm = "";
        String sb = sc.nextLine();
        char[] ch = sb.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            hmm += ch[i];
        }
        System.out.println(hmm);
    }
}
