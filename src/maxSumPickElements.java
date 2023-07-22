// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class maxSumPickElements {
    // Brute force Approach 1
    public static int maxSumPickElements(int[] A, int B) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;

        // Try all possible combinations of B elements from either the left or right end
        for (int i = 0; i <= B; i++) {
             int[] leftElements = new int[i];
            int[] rightElements = new int[B - i];

            // Pick elements from the left end
            for (int j = 0; j < i; j++) {
                leftElements[j] = A[j];
            }

            // Pick elements from the right end
            for (int k = 0; k < B - i; k++) {
                rightElements[k] = A[n - B + i + k];
            }

            // Calculate the sum of the picked elements
            int currentSum = sumArray(leftElements) + sumArray(rightElements);

            // Update maxSum if necessary
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    // Brute force Approach 2
public static int maxSumPickElements2(int[] A , int B){
    int n = A.length;
    int maxSum = Integer.MIN_VALUE;

    // Try all possible combinations of B elements from either the left or right end
    for (int i = 0; i <= B; i++) {
        for (int j = 0; j <= B - i; j++) {
            int currentSum = 0;

            // Pick elements from the left end
            for (int k = 0; k < i; k++) {
                currentSum += A[k];
            }

            // Pick elements from the right end
            for (int l = n - 1; l >= n - j; l--) {
                currentSum += A[l];
            }

            // Update maxSum if necessary
            maxSum = Math.max(maxSum, currentSum);
        }
    }

    return maxSum;
}


    // Helper function to calculate the sum of an integer array
    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

            int[] A1 = {5, -2, 3, 1, 2};
            int B1 = 3;
            System.out.println(maxSumPickElements(A1, B1)); // Output: 8
            System.out.println(maxSumPickElements2(A1, B1)); // Output: 8

            int[] A2 = {1, 2};
            int B2 = 1;
            System.out.println(maxSumPickElements(A2, B2)); // Output: 2
            System.out.println(maxSumPickElements2(A2, B2)); // Output: 2
    }
}
