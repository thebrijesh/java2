package leetcode;

public class RotetedSearchArray {
    public static void main(String[] args) {
//        int[] arr = { 101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        int[] arr = {  9, 10, 11, 12, 14, 15, 17, 19, 24, 25, 30, 39, 40, 44, 46, 48, 51, 53, 54, 56, 59, 60, 69,
                70, 73, 75, 80, 87, 88, 89, 92, 93, 97, 99, 104, 107, 109, 110, 111, 117, 123, 124, 125, 126, 127,
                128, 135, 136, 137, 141, 148, 153, 154, 161, 166, 167, 169, 175, 177, 180, 181, 182, 185, 186, 189,
                193, 198, 202, 1, 2, 6, 7};
        System.out.println(search(arr, 198));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int n = end;
        int mid;

        while(start <= end){
            mid = start + (end -start)/2;

            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] >= nums[start]){
                if(nums[start] <= target && nums[mid] > target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] < target && nums[end] >= target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }

        return -1;
    }}
