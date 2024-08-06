package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MaximumLength_1239 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] arr = {"ab", "cd", "cde", "cdef", "efg", "fgh", "abxyz"};
        Collections.addAll(list, arr);
        String str = "";
        int idx = 0;
        System.out.println(maxLength(list, str, idx));
    }


    public static int maxLength(List<String> arr, String str, int idx) {
        if (idx >= arr.size()) {

            return str.length();
        }


        int a = 0;
        int b = 0;
        if (checkDupli(str, arr.get(idx))) {

            a = maxLength(arr, str + arr.get(idx), idx + 1);
        }

        b = maxLength(arr, str, idx + 1);


        return Math.max(a, b);
    }

    public static boolean checkDupli(String str, String st) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        for (char c : st.toCharArray()) {
            if (set.contains(c)) {
                return false;
            } else {
                set.add(c);
            }
        }

        return true;
    }
}
