package leetcode;

public class MaximumProductOfThreeNumbers {

    public static int maximumProduct(int[] nums) {
        int min = 0; int secondMin =0; int thirdMin =0; int max =0; int secondMax =0; int thirdMax =0;
        for(int i =0; i<nums.length; i++){

            if (nums[i] < 0){
                if (min > nums[i]){
                    thirdMin = nums[i];
                    secondMin = thirdMin;
                    min = secondMin;

                } else if (min > secondMin) {
                    thirdMin = nums[i];
                    secondMin = thirdMin;
                }else {
                    thirdMin = nums[i];
                }

            }
        }
        System.out.println(thirdMin);
        
        return 5;
    }

    public static void main(String[] args) {
        int[] arr = {-6,4,-5,3,2,8};

    }
}
