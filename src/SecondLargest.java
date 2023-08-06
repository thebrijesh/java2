public class SecondLargest {
    private static int secondlargest(int[] arr) {
        int max = 0; int j =0;
        if (arr.length <= 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] >max) {
               max = arr[i];
               j =i;
            }
        }
        arr[j] = -1;
        max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] >max) {
               max = arr[i];

            }
        }

        Rotationgame.printArray(arr);
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};
        secondlargest(arry);
    }
}
