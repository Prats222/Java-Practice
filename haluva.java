import java.util.Scanner;

public class haluva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a == b) {
            System.out.println("Numbers are same");
        } else {
            System.out.println("Diffrent");
        }
    }
}
