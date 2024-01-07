import java.util.Scanner;

public class sumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tsum = 0;
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            Tsum += sum;
        }
        System.out.println(Tsum);
    }
}
