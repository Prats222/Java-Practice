package PracticeString;

import java.util.Scanner;

public class reversewords {
    public static void reverse(String[] arr, int start, int end) {
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        String[] words = sb.trim().split("\\s+");
        reverse(words, 0, words.length - 1);
        System.out.println(String.join(" ", words));
    }
}
