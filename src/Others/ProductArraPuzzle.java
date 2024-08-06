package Others;

public class ProductArraPuzzle {

    public static void productArrayPuzzle(int[] arr) {
        int multi = 1;
        for (int i = 0; i < arr.length; i++) {
            multi *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = 1;
            int end = multi;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid * arr[i] == multi) {
                    arr[i] = mid;
                   break;
                } else if (mid * arr[i] > multi) {
                        end = mid - 1;

                    } else {
                        start = mid + 1;
                    }

                }

        }

        System.out.println(multi);
        Rotationgame.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        productArrayPuzzle(arr);


    }

}
