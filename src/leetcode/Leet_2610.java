package leetcode;

import java.util.ArrayList;
import java.util.List;

// Convert an Array Into a 2D Array With Conditions
public class Leet_2610 {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int max = 0;
        int freq[] = new int[201];
        for (int i = 0; i < nums.length; i++) {

            if (freq[nums[i]] >= list.size()) {
                list.add(new ArrayList<>());
            }
            list.get(freq[nums[i]]).add(nums[i]);
            freq[nums[i]]++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 8, 9, 3, 4, 4, 1, 8, 9, 3, 3, 9, 6, 7, 9, 8};
        findMatrix(arr);
    }
}
