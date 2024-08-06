package Backtracking;

import java.util.ArrayList;
import java.util.List;


public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        System.out.println(list);
        return list;
    }

//    private static void backtrack(List<List<Integer>> list, int[] nums, int idx) {
//        if (idx == nums.length-1) {
//            ArrayList<Integer> l = new ArrayList<>();
//            for (int i = 0; i < nums.length; i++) {
//                l.add(nums[i]);
//            }
//            list.add(l);
//            return;
//        }
//        for (int i = idx; i < nums.length; i++) {
//
//            swap(i, idx, nums);
//            backtrack(list, nums, idx+1);
//            swap(i, idx, nums);
//        }
//    }
//
//    public static void swap(int i, int idx, int[] nums) {
//        int temp = nums[i];
//        nums[i] = nums[idx];
//        nums[idx] =temp;
//    }

    private static void backtrack(List<List<Integer>> list, List<Integer>   tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i])) continue; // element already exists, skip
            tempList.add(nums[i]);
            backtrack(list, tempList, nums);
            tempList.remove(tempList.size() - 1);

        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permute(arr);

    }
}
