import java.util.*;

public class functions {
    public static void Calc(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Calc(a);
    }
}
