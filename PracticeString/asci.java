package PracticeString;

import java.util.*;

public class asci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int asci = (int) ch;
            System.out.print(asci + " ");
        }
        sc.close();
    }
}
