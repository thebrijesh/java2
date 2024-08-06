package Others;

public class Max_Non_Negative_SubArray {
    public void pseudocode(){
//        https://www.interviewbit.com/problems/max-non-negative-subarray/
//        variable start,end,currentSum, totalSum, currentStart
//        declare the first loop (i = 0; i<n)
//        if(0<arr[i]) sum arr[i]
//        if(0>arr[i]) check currentSum bigger than totalSum
//        if true so first of add currentSum in totalSum and after add i in end variable
//        after add currentStart in start

//        change currentStart value to i+1 and change currentSum value 0.

//        after complete all iteration of for loop then check if(start == end) so make array size 1 and return array;
//        and above condition is not true so declare the new size array(end-star).
//        after declare the array insert value from arr[i] to new declare array.(i=start; i<end)
//        return new array;

    }
    public static int[] maxset(int[] arr) {
        int totalSum = 0;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                currentSum += arr[i];
            }
            if (arr[i] < 0 || i == arr.length - 1) {
                if (currentSum > totalSum) {
                    totalSum = currentSum;
                    start = currentStart;
                    end = i;
                }
                currentStart = i + 1;
                currentSum = 0;
            }
        }
        if (end == start) {
            int ans[] = new int[1];
            ans[0] = arr[start];
            return ans;
        }
        int ans[] = new int[end-start];
        int idx = 0;
        for (int i = start; i < end; i++) {
            ans[idx++] = arr[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] height1 = {1, -2, 5, -7, 2, 5, 9, -7, 8};
        int[] ans = maxset(height1);
        //System.out.println(maxset(height1));
        for (int num:ans) {
            System.out.println(num);
        }

    }
}
