package GFG;

public class RemoveOneElement {
    public static boolean canBeIncreasing(int[] nums) {
        int ans = 0;
        int last = nums[0];

        int counter = 0;

        if (nums.length == 2) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {
                counter++;
                last = nums[i];


            } else if (i >= 1 && nums[i - 1] < nums[i + 1]) {
                return true;
            } else {
                for (int j = 1; j < nums.length - 1; j++) {
                    if (
                            nums[j - 1] == nums[j + 1] && nums[j] < nums[j - 1] && nums[j] < nums[j + 1] ||
                            nums[j] < nums[j - 1] && nums[j] < nums[j + 1] && nums[j - 1] < nums[j + 1] ||
                            nums[j] < nums[j - 1] && nums[j] < nums[j + 1] && nums[j - 1] < nums[j + 1] && nums[j] < nums[j + 1]) {
                        return true;

                    }
                }
            }
        }

        if (counter == nums.length - 1) {
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        int[] arr = {915,444,500};
        System.out.println(canBeIncreasing(arr));
    }
}
