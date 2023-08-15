package GFG;

public class LargestProduct {
    public static long findMaxProduct(int A[], int n, int k) {
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i] * A[i - 1];
            System.out.println(A[i]);
        }
        int max = 0;
        for (int i = k-1; i < A.length; i++) {
            if(i-(k-1) == 0){
                max = A[i];

            }else {
                int value = A[i] / A[i-k];
                max = Math.max(max,value);
            }

        }

        return max;  // Your code here
    }

    public static void main(String[] args) {
        int[] arr = {8,6, 4, 6 };
        int n = 4;
        int k = 3;
        System.out.println(findMaxProduct(arr, n, k));
    }
}
