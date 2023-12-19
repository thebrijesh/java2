package GFG;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5};
        long[] arr1 = {1, 2, 3};

        System.out.println(isSubset(arr, arr1, 6, 3));
    }

    public static String isSubset(long[] a1, long[] a2, long n, long m) {


        HashMap<Long, Long> map = new HashMap<>();

        for (int i = 0; i < a1.length; i++) {

            if (map.containsKey(a1[i])) {

                map.put(a1[i], map.getOrDefault(a1[i], Long.valueOf(1)) + 1);

            } else {
                map.put(a1[i], Long.valueOf(1));
            }

        }

        for (int i = 0; i < a2.length; i++) {
            if (map.containsKey(a2[i])) {

                map.put(a2[i], map.getOrDefault(a2[i], Long.valueOf(1)) - 1);


            } else {
                return "no";
            }
        }


        return "yes";

    }
}
