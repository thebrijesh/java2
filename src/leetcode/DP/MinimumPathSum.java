package leetcode.DP;

public class MinimumPathSum {
    static int min = Integer.MAX_VALUE;

    public static int minimumPathSum(int[][] arr, int left, int down, int sum) {
        if (down == arr[0].length - 1 && left == arr.length - 1) {

            return arr[left][down];
        } else if (down > arr[0].length - 1 || left > arr.length - 1) {
            return Integer.MAX_VALUE;
        }


        return arr[left][down] + Math.min(minimumPathSum(arr, left + 1, down, sum), minimumPathSum(arr, left, down + 1, sum));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minimumPathSum(arr, 0, 0, 0));
    }
}
