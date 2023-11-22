import java.util.*;

public class Prac {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(Math.pow(a, b));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = GCD(a, b);
        System.out.println(ans);
    }
}
