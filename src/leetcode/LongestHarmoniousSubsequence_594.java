package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LongestHarmoniousSubsequence_594 {

    public static int findLHS(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int count1 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (nums[i] + 1 == nums[j]) {
                    count1++;
                }
            }
            if (count1 != 0) {
                max = Math.max(max, count + count1);
            }
        }
        return max;
    }

    public static int findLHS1(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        int count1 = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[start] - nums[i]) < 2) {
                if (nums[start] - nums[i] == 0) {
                    count++;
                } else {
                    count1++;
                }
            } else {
                if (count != 0 && count1 != 0) {
                    max = Math.max(max, count + count1);
                }
                if (nums[i] - nums[i - 1] == 1) {
                    start = i - 1;
                    count = count1;
                    count1 = 1;
                } else {
                    start = i;
                    count = 1;
                    count1 = 0;
                }


            }


        }
        if (count != 0 && count1 != 0) {
            max = Math.max(max, count + count1);
        }
        return max;

    }

    public static int findLHS2(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (var num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 1) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (var num : nums) {
            int num1 = 0;
            int nu2 = 0;
            num1 = map.get(num);
            int num2 = num + 1;
            if (map.containsKey(num2)) {
                nu2 = map.get(num2);
                max = Math.max(max, num1 + nu2);
            }
        }
        return max;
    }

    public static int findLHS3(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < nums.length) {


            while ((nums[right] - nums[left]) > 1) {

                left++;
            }
            if (nums[right] != nums[left]) {
                max = Math.max(max, right - left + 1);
            }


            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS3(arr));
    }
}
