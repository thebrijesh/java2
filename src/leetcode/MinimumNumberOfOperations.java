package leetcode;

import java.util.HashSet;

public class MinimumNumberOfOperations {

    // Brut force
    public static int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            int ans = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (i != j && boxes.charAt(j) == '1') {
                    ans += Math.abs(j - i);
                }
            }
            arr[i] = ans;
        }
        for (var num : arr) {
            System.out.println(num);
        }
        return arr;
    }
    // using HashSet
    public static int[] minOperations1(String boxes) {
        int[] arr = new int[boxes.length()];

        int count = 0;
        int sum =0;
        int idx = 0;
        boolean flag = false;
        for (int i = 0; i < boxes.length(); i++) {
            arr[i] += sum;
            if(boxes.charAt(i) == '1'){
                count++;


            }
            sum += count;

        }
        sum = 0; count = 0;

        for (int i = boxes.length()-1; i >= 0; i--) {
            arr[i] += sum;
            if(boxes.charAt(i) == '1'){
                count++;


            }
            sum += count;

        }



        for (var num : arr) {
            System.out.println(num);
        }
        return arr;
    }



    public static void main(String[] args) {
        String boxes = "001011";
        System.out.println(minOperations1(boxes));
    }
}
