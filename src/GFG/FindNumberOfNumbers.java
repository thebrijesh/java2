package GFG;

public class FindNumberOfNumbers {
    public static int num(int a[], int n, int k){
        int ans; int counter = 0;
        for (var num:a) {
            for (int i = 0; 0 < num; i++) {
                ans = num % 10;
                num = num/10;
                if (ans == k ) {
                    counter++;
                }

            }
        }

        return  counter;
    }


    public static void main(String[] args) {
        int[] arr = {100,120,1111,5551,2512};
        int k = 1;

        System.out.println(num(arr,5,k));
    }
}
