import java.util.*;

public class palindrome {
    public static void Pali(int n) {
        int rem, sum = 0, temp;

        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;

        }
        if (temp == sum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not pali");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pali(n);
    }
}
