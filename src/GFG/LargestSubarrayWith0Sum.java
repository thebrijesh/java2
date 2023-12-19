package GFG;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    static int maxLen(int arr[], int n) {
        int sum =0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            {if (map.containsKey(sum)) count = Math.max(count,i - map.get(sum));else map.put(sum, i);}
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,-1,1};
        System.out.println(maxLen(arr, 8));
    }
}
