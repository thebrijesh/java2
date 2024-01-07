package Backtracking;

public class SumOfAllSubsetXORTotals {
    static int sum = 0;
    public static int subsetXORSum(int[] nums) {
        int ss = solve(nums,0,0);
        System.out.println(ss);
        return sum;
    }

    public static int solve(int[] nums, int val, int idx){
        if(idx == nums.length){
            sum += val;
            System.out.println(sum);
            return val;
        }
//        val = val ^ nums[idx];
        solve(nums,val ^ nums[idx],idx+1);

        solve(nums,val,idx+1);
        return val;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        solve(arr,0,0);
    }
}
