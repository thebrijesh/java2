package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class JumpGameII {

//    public static int jump(int[] nums) {
//        int i =0; int j =0; int max = 0; int value =nums[0]; int counter = 0;
//        int start = 0;
//        if(nums.length == 2){
//            return 1;
//        } else if (nums[0] > nums.length) {
//            return 1;
//        } else if (nums.length == 1) {
//            return 0;
//        }
//        while ( i  < nums.length){
//
//            for ( j = 0; j <= nums[i] ; j++) {
//                if ()
//            }
//
//        }
//
//       return counter;
//    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        HashMap<Integer,Integer > freq=new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);

        for (int i = 0; i < m; i++)
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        for (int it: freq.keySet())
            Union.add(it);
        return Union;
    }
    public static void main(String[] args) {
//int[] arr = {1,2,1,1,1};
//        System.out.println(jump(arr));
        int n = 6, m = 7;
        int arr1[] = {1,42,33,100,1000,333};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}
