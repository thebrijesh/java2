package GFG;

public class FindTheClosestNumber {
    public static int findClosest(int arr[], int n, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;

            }

        }
        System.out.println(arr[mid]);
        System.out.println(arr[start]);
        System.out.println(arr[end]);
        int val1 = 0;
        int val2 = 0;
        if (arr[start] - target == target - arr[end]) {
            return arr[start];
        } else {
            val1 = arr[start] - target;
            val2 = target - arr[end];
            int a = Math.min(val1, val2);
            if (a == val1){
                return arr[start];
            }else {
                return arr[end];
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,3,5,5,7,8,10,12,12,13,14,16};
        int n = 7;
        int k = 10;
        System.out.println(findClosest(arr, n, k));
    }
}
