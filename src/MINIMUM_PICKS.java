public class MINIMUM_PICKS {
    private static int minimumPicks(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                max = Math.max(max, arr[i]);
            } else {
                min = Math.min(min, arr[i]);
            }
        }
        int result = max - min;
        return result;
    }

    public static void main(String[] args) {
        int[] arry = {0,2,9};
        System.out.println(minimumPicks(arry));
    }
}
