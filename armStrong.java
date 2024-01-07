import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bck = n;
        int temp = n;
        int rev;
        double sum = 0.0;
        int count = 0;

        while (bck > 0) {
            count++;
            bck /= 10;
        }
        while (n > 0) {
            rev = n % 10;
            n /= 10;
            sum = sum + Math.pow(rev, count);
        }
        if (temp == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
