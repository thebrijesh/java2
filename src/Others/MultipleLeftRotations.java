package Others;

import java.util.ArrayList;
import java.util.List;

public class MultipleLeftRotations {
    private static void newarray(int[] arr, int b) {


        reverseArray(arr, 0, b - 1);
        reverseArray(arr, b, arr.length - 1);

    }

    private static  List<int[]>  rotateArray(int[] arr, int[] b) {
        int n = arr.length - 1;
        int c = 0;
        List<int[]> list = new ArrayList<>();
        reverseArray(arr,0,n);

        for (int i = 0; i < b.length; i++) {
            int[] newarr = new int[n + 1];
            for (int j = 0; j < arr.length; j++) {
                newarr[j] = arr[j];
            }
            c = b[i] % (n + 1);
            newarray(newarr, c);
            list.add(newarr);
        }
        return list;
    }

    private static void reverseArray(int[] arr, int i, int j) {

        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};

        int[] B = {2, 3};

        rotateArray(arry,B);
    }
}
