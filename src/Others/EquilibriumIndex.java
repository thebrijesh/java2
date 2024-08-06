package Others;

public class EquilibriumIndex {
    private static int index(int[] arr) {


        for (int i = 1; i < arr.length - 1; i++) {
            arr[i] += arr[i - 1];

        }

        for (int i = 1; i < arr.length; i++) {
            int n = arr[arr.length - 1] - arr[i];
            if (arr[i - 1] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(index(arr));
    }
}
