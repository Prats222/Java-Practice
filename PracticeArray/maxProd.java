package PracticeArray;

import java.util.Scanner;

public class maxProd {
    public static int maxProd(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int mul = 1;
            for (int j = i; j < arr.length; j++) {
                mul *= arr[j];
                max = Math.max(max, mul);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProd(arr));
    }

}