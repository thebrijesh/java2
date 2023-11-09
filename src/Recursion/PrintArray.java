package Recursion;

import java.util.ArrayList;

public class PrintArray {

    static int printArray(int[] arr, int idx, int max) {
        if (idx == arr.length) {
            return max;
        }

        if (arr[idx] > max) {
            max = arr[idx];
        }
        return printArray(arr, idx + 1, max);

    }

    static ArrayList<Integer> search(int[] arr, int idx, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        if (idx >= arr.length) {
            return list;
        }

        if (arr[idx] == target) {
            list.add(idx);
        }
        ArrayList<Integer> ans = new ArrayList<>();
         ans = search(arr, idx + 1, target);
        list.addAll(ans);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(printArray(arr, 0, Integer.MIN_VALUE));
        System.out.println(search(arr, 0, 1));
    }
}
