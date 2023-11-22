import java.util.*;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // spaces
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
