import java.util.*;

public class ExtraAdvP {
    public static void main(String[] args) {
        // palindromic pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 1st half-starting from down like 5 and decrementing to 4 3 2 1.
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2nd half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
