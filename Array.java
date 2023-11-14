import java.util.*;

public class Array {
    public static void main(String[] args) {
        // -----------------------------------------------------------------------
        // int marks[] = { 98, 97, 96 };
        // // int[] marks = new int[3];
        // // marks[0] = 98;
        // // marks[1] = 97;
        // // marks[2] = 96;
        // // System.out.println(marks[0]);

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }
        // -----------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        // ------------------------------------------------------------------------
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("OUTPUT:" + numbers[i] + " ");
        // }
        // -----------------------------------------------------------------------------
        // int size = sc.nextInt();
        // String name[] = new String[size];

        // for (int i = 0; i < size; i++) {
        // name[i] = sc.next();
        // }
        // for (int i = 0; i < name.length; i++) {
        // System.out.println(name[i]);
        // }
        // --------------------------------------------------------------------------------

        // **** 2-D ARRAY **** //
        // int rows = sc.nextInt();
        // int columns = sc.nextInt();

        // int numbers[][] = new int[rows][columns];

        // // input

        // // rows
        // for (int i = 0; i < rows; i++) {
        // // columns
        // for (int j = 0; j < columns; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }
        // // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }
        // ----------------------------------------------------------------------------
        // QUESTION 2-D ARRAY
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int numbers[][] = new int[rows][columns];

        // input

        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (x == numbers[i][j]) {
                    System.out.println(x + " found at " + i + " and " + j);
                }
            }

        }
        sc.close();
    }

}
