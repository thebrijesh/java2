import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2616 {
    //    Minimize the Maximum Difference of Pairs
    private static void leetcode(int[] arr, int p) {
        int min = Integer.MAX_VALUE;
        int value = 0;
        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < p; k++) {
            for (int i = k; i < arr.length; i++) {

                    for (int j = i + 1; j < arr.length; j++) {
                        if (i!=start&& j!=end) {
                        value = Math.abs(arr[i] - arr[j]);
                        if (min > value) {
                            min = value;
                            start = i;
                            end = j;
                        }
                    }

                }

            }

            list.add(arr[start]);
            list.add(arr[end]);
        }
        System.out.println(start + "," + end);

        for (var num:list) {
            System.out.println(num);
        }
    }
    public static int peakIndexInMountainArray(int[] nums) {
        int mid =0; int start = 0; int end = nums.length-1;

        for(int i =start; i<end; i++){
            mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return 1;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int p = 2;
        System.out.println(peakIndexInMountainArray(arr));
    }
}
