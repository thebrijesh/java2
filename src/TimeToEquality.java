public class TimeToEquality {
    public  static int timeTOEquality(int[] arr){
        int sum =0; int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            sum += arr[i];

        }
        return (arr.length * max) - sum;
    }
    public static void main(String[] args) {
int [] arr = {2, 4, 1, 3, 2};
        System.out.println(timeTOEquality(arr));
    }
}
