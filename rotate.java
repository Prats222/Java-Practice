import java.util.*;

public class rotate {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
