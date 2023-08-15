package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    int multi = 2 * arr[j];
                    if (multi == arr[i]) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

//    optimized approach

    public static boolean checkIfExists(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var num : arr) {
            if (num % 2 == 0) {
                if (map.containsKey(num * 2) || map.containsKey(num / 2)) {
                    return true;
                } else {
                    map.put(num, 1);
                }

            }else {
                if (map.containsKey(num * 2)){
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {14, 1, 7, 11};
//        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExists(arr));
    }
}
