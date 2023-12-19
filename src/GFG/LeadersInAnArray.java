package GFG;

import java.util.ArrayList;

public class LeadersInAnArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int max =0;
        for(int i =0; i<arr.length; i++){
            if(i != n-1 && arr[i] < arr[i+1]) {
                list.add(arr[i+1]);
            }

            if(i == n-1){
                list.add(arr[i]);
            }
        }

        return list;
    }

    static void findMax(int start , int end ,int[]arr){
        for (int i = start; i < end && arr[i] > arr[i+1] ; i++) {

        }
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr, 6));
    }
}
