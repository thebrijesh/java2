import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetcode15_3Sum {
//    find the triple sum first thing is a short array
//    declare the has set for insert unique values
//    declare the first loop 0 to n.length-1
//    declare the while loop these start j < k (j = i+1,k =n-1 )
//    check condition if i, j,k position values sum is equal to target.
//    is true so add values in the set after making a list and j and k values ++;
//    if sum < 0 so incense j value +1;
//    else k--
//            return new arraylist<>(set)

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}
