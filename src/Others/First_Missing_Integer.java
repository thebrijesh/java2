package Others;

import java.util.Arrays;

public class First_Missing_Integer {
public static void pseudocode(){
//    https://leetcode.com/problems/first-missing-positive/
    //i will sort the array because i finding first missing element in array.
    // make a variable; smallestMissing =0;
    //after take a for each loop and check (num == smallestMissing) is true so smallestMissing++;
    // is not true so return this number
}
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int smallestMissing = 1;
        for (int num : nums) { 
            if (num == smallestMissing) {
                smallestMissing++;
            }
        }

        return smallestMissing;
    }
    public static void main(String[] args) {
        int[] nums2 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums2));
    }
}
