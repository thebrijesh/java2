package leetcode;

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int j = 1;
        int i = 0;
        int counter = 0;
        int ans = 0;
        while (j < arr[arr.length - 1] + k) {
            if(j == arr[i] && j < arr.length) {
                i++;
             j++;


            } else {
                j++;
                counter++;
            }
            if (k == counter) {
                ans = j;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        System.out.println(findKthPositive(arr, k));
    }
}
