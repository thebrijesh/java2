package leetcode;

public class FindMinimum {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int min = Integer.MAX_VALUE;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < min) {
                min = nums[mid];
            }
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
