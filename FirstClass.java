import java.util.*;

public class FirstClass {
    public static void main(Strings[] args) {
        int n = 4;
        int m = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                if ((i == 2 || i == 3) && (j == 2 || j == 3 || j == 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}