package Recursion;

public class fiveto1prac {
    public static void main(String[] args) {
        int n = 5;
        // Normal way(loops)
        // for (int i = 5; i > 0; i--) {
        // System.out.println(i);
        // }
        printNumber(n);
    }

    // Recusrion
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }
}
