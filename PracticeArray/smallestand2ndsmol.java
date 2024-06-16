package PracticeArray;

import java.util.*;

public class smallestand2ndsmol {
    public static void element(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secSmallest && arr[i] != smallest) {
                secSmallest = arr[i];
            }
        }
        System.out.println("Smallest :" + smallest);
        System.out.println("SecondSmol:" + secSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        element(arr);
    }
}
