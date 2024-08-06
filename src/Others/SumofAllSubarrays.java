package Others;

public class SumofAllSubarrays {
    public static void sum(int[] arr){
        int val = arr[0] * arr.length;
        int totalValue = 0; int multi = 0;
        for (int i = 1; i < arr.length; i++) {
           totalValue = val - (i) + (arr.length-(i));
           multi = totalValue * i;
        }
        System.out.println(multi);

    }

    public static void sum2(int[] arr){
        int result =0; int temp =0;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i; j < arr.length; j++) {
               temp+= arr[j];
               result += temp;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum2(arr);
    }
}
