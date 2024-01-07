package Recursion;

import java.util.Arrays;

public class MergeShort {

    public static void mergeShort(int[] arr,int l,int r){
        if (l >= r)return;
        int mid = (l+r)/2;

        mergeShort(arr,l,mid);
        mergeShort(arr,mid+1,r);
        solve(arr,mid,l,r);
    }

    private static void solve(int[] arr, int mid, int l, int r) {
        int n1 = mid - l +1;
        int n2 = r -mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1){
            arr[k++] = left[i++];
        }
        while (j < n2){
            arr[k++] = right[j++];
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        mergeShort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
