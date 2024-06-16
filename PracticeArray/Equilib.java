package PracticeArray;
//An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. 

//Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
// Output: 3 
// 3 is an equilibrium index, because: 
// A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

import java.util.*;

public class Equilib {
    public static int indx(int[] arr) {
        int totalsum = 0, leftsum = 0;
        for (int num : arr) {
            totalsum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalsum -= arr[i];
            if (leftsum == totalsum)
                return i;
            leftsum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Output :" + indx(arr));
    }
}
