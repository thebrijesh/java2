package leetcode;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;


    }

    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            int[] sum = new int[matrix[0].length];
            for (int j = i; j < matrix.length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    sum[k] += matrix[j][k];
                }
                count += subarraySum(sum, target);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{-1, 1, 0},
                {2, 1, 1},
                {-4, 1, 2}};
        System.out.println(numSubmatrixSumTarget(arr, 1));
    }
}
