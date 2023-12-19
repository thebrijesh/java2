package GFG;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            if (i > 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum1 += arr[j];
                }

                if (sum == sum1) {
                    return i + 1;
                }
            }

            sum = 0;
            sum1 = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] arr = {1, 5, 2, 2, 1, 1, 1, 8};
        System.out.println(equilibriumPoint(arr, 8));
    }
}
