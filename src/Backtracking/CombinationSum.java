package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        combinationSum(arr, 8, list, new ArrayList<>(), 0, 0);
        System.out.println(list);

    }

    public static void combinationSum(
            int[] candidates, int target,
            List<List<Integer>> list2d,
            List<Integer> list,
            int start,
            int sum
    ) {
        if (sum > target) return;
        else if (sum == target) list2d.add(new ArrayList<>(list));
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i-1]) continue;
                if (sum + candidates[i] > target)break;

                list.add(candidates[i]);
                combinationSum(candidates, target, list2d, list, i+1, sum + candidates[i]);
                list.remove(list.size() - 1);
            }
        }


    }


}
