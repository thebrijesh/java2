package leetcode;

//1909. Remove One Element to Make the Array Strictly Increasing
public class Leet_1909 {
    public static boolean canBeIncreasing(int[] nums) {
        if(nums.length == 2) return true;
        if (nums[0] == nums[nums.length-1] )return false;
int p = 0;

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i-1] > nums[i]){
                if (nums[i-1]>nums[i+1]){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,10,5,7};
        System.out.println(canBeIncreasing(arr));
    }
}
