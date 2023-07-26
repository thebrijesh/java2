public class MaxSubarraySum {
    public void pseudocode(){
        //max =0
        //for i = 0 to nums.length
        // curent sum  = 0;
        //for j from i to nums.length
        // currentsum = currentsum + nums[j];
        // compare max and current sum (big in both of them these value insert in max)
        // return max
    }
    public static int maxSubarraySum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += nums[end];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(nums1)); // Output: 6

        int[] nums2 = {1};
        System.out.println(maxSubarraySum(nums2)); // Output: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(maxSubarraySum(nums3)); // Output: 23
    }
}
