package Others;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void reverseArrayList(ArrayList<Integer> arr, int k) {
        int start = 0;
        int end = k;
        int temp = 0;
        int b = k;
        boolean flag = false;

        for (int i = 0; i < arr.size(); i++) {
            if (start < end) {
                temp = arr.get(start);
                arr.set(start, arr.get(end - 1));
                arr.set(end - 1, temp);
                start++;
                end--;
            }else {
                if (!flag) {
                    if (k + b <= arr.size()) {
                        start = k;
                        k = k + b;
                        end = k;
                    } else {
                        start = k;
                        end = arr.size();
                        flag = true;
                    }
                } else {
                    break;
                }

            }
        }
        System.out.println(arr);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int k = 16;
    }
}
