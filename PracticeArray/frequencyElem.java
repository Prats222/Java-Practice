package PracticeArray;

import java.util.*;

public class frequencyElem {
    public static HashMap<Integer, Integer> countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 3, 3 };
        HashMap<Integer, Integer> frequencies = countFreq(arr);
        System.out.println("Frequencies of elements: " + frequencies);
    }
}
