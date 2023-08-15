package GFG;

import java.util.ArrayList;

public class TripletFamily {
    public static ArrayList<Integer> findTriplet(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (var num : arr) {
            list.add(num);
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];
                if (list.contains(sum)) {
                    list.clear();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[i] + arr[j]);
                    return list;

                }


            }
        }
        list.clear();
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 16, 6, 15, 25};
        int n = 6;
        System.out.println(findTriplet(arr, n));
    }
}
