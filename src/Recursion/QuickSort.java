package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 4, 6, 3, 2, 8};
        int start = 0;
        int end = arr.length;
        quickSort(arr,start,end-1   );
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[]arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end){
            return;
        }
        int pi = partiTion(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }

    private static int partiTion(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start+1; i <= end; i++) {
            if (arr[i] <= pivot){
                count++;
            }
        }
        int i = start;
        int j = end;
        int pivotIdx = start + count;
        swap(arr,i,pivotIdx);

        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
}
