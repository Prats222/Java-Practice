package Recursion;

import java.util.Scanner;

public class onetoN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();

        // Generate and print array without loops
        generateAndPrintArray(n, 1);
    }

    // Recursive function to generate and print array
    private static void generateAndPrintArray(int n, int current) {
        if (current <= n) {
            System.out.print(current + " ");
            generateAndPrintArray(n, current + 1);
        }
    }
}
