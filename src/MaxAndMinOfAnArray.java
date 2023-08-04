public class MaxAndMinOfAnArray {

    public static void minMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > min) {
                max = num;
            }else {
                min = num;
            }
        }
        System.out.println(max + " "+ min);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};
        minMax(arry);
    }
}
