package ExceptionHandle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // try catch block
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide : ");
            int x = sc.nextInt();

            System.out.println("Enter a whole number to divide to by :");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {

            System.out.println("null");
        } catch (InputMismatchException e) {
            System.out.println("kuch bhi likhta hai Lau Deh? number likhna !!!!");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        // done to close anything or give any last message.
        finally {
            sc.close();
        }

    }
}
