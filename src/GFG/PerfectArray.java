package GFG;

public class PerfectArray {
    static boolean checkUnimodal(int arr[], int n) {
        int idx = 0;


        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;

        for (int i = 0; i < arr.length - 1 && flag3 == 0; i++) {
            if (arr[i] < arr[i + 1] && flag1 == 0) {
                idx++;

            } else if (arr[i] == arr[i + 1] && flag2 == 0) {
                flag1 = 1;
                idx++;
            } else if (arr[i] > arr[i + 1] && flag3 == 0) {
                idx++;
                flag1 =1;
                flag2 = 1;
            } else {
                flag1 =1;
                flag2 = 1;
                flag3 = 1;
            }
        }

        if (idx == arr.length - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 8, 8, 3, 2};
        System.out.println(checkUnimodal(arr, 5));
    }
}
