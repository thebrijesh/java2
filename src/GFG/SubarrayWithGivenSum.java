package GFG;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int start = 0;
        for (int i = 0; i < arr.length || start < arr.length; i++) {


            if (sum != s) {
                sum += arr[i];

            }

            if (sum == s) {
                list.add(start);
                list.add(i - 1);
                System.out.println(start + " " + i);
            } else if (sum > s) {
                sum = sum - arr[start];
                start++;
            }

//            if (i == arr.length - 1 && sum != s )
//            {
//                if (start == arr.length-1){
//                    break;
//                }
//                i--;
//                start++;
//
//            }

        }


        return list;
    }

    public static void main(String[] args) {
        int[] arr = {28, 68, 142 ,130, 41 ,14 ,175, 2 ,78 ,16 ,84 ,14 ,193 ,25 ,2 ,193 ,160 ,71 ,29 ,28, 85, 76, 187 ,99 ,171 ,88 ,48 ,5 ,104 ,22 ,64, 107, 164, 11, 172, 90, 41, 165, 143, 20, 114 ,192, 105, 19, 33, 151 ,6 ,176 ,140, 104, 23 ,99 ,48 ,185, 49, 172, 65};
        System.out.println(subarraySum(arr, 7, 1562));
    }
}
