import java.util.*;

public class Fibonacci {
    public static void Fibbo(int n) {
        int a = 0, b = 1, temp;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibbo(n);
    }
}
