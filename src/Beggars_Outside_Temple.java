public class Beggars_Outside_Temple {
    public void pseudocode(){
//        make a array size of beggars
//        declare the first loop that running 0 to arr.length;

//        declare the second loop under the first loop that running value of
//        0 index element to value of 1 index element.

//        we have a given 2D array in beggars and coin. all raw in the third element is given coin
//        and one and second element is given beggars number.

//        coin add in to all beggars.
    }
    public static int[] Beggars_Outside_Temple(int[][] arr, int c) {
        int[] sum = new int[c];
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i][0]; j <= arr[i][1]; j++) {
                sum[j - 1] += arr[i][2];

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int[] ans = Beggars_Outside_Temple(arr, 5);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
