package GFG;

import java.util.*;

public class FindDuplicatesInAnArray {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int[] array = new int[1000000];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i  = 0; i<arr.length; i++) array[arr[i]]++;

        for(int i  = 0; i<array.length; i++) if(array[i] > 1) list.add(i);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,4,5,5,6,6};
        System.out.println(duplicates(arr, 6));
    }
}


