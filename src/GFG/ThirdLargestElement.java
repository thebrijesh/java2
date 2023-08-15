package GFG;

public class ThirdLargestElement {
    public static int thirdLargest(int a[], int n) {
        int first = Integer.MIN_VALUE;
        int second = 0;
        int third = 0;
        for (var num : a) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        int n = 4;

        System.out.println(thirdLargest(arr, n));
    }
}
