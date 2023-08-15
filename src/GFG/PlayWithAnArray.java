package GFG;

public class PlayWithAnArray {
    public static int[] formatArray(int[] a, int n) {
        int temp = 0;
        for (int i = 1; i <a.length ; i = i+2) {
           if(a[i] < a[i-1]) {
               temp = a[i];
               a[i] = a[i-1];
               a[i-1] = temp;

           }
        }

        return a;
    }

    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        int n =5;
        System.out.println(formatArray(arr,n));
    }
}
