// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class maxSumPickElements {
    public static void pseudocode(){
//        1) takes a for loop(i) and it iterates 0 to b because operations are b time. 2) make two arrays.
//            array1 and array 2. Array 1 size is [ I ] and array 2 size of [ b-i ].
//            I make two arrays because I will sum of both sides of Array A.
//        3) because I will take another two loops.
//        5) the second loop(j) iterates 0 < i. and the third loop(k) iterates 0 < b-i
//        6) when the second loop iterates then values of array A stored in array 1.
//           by sum1 variable(position of I in array A ).
//        7) when the third loop iterates the last b-i elements go to array A to array 2  by sum2 variable.
//        8) when getting the elements in variable sum1 and sume2 after the sum of these elements stored in the name of the variable is a current sum.
//           this variable declares under the first loop because, in every iteration of the first loop, this variable value is 0.
//        9) after declaring a global max-sum variable this default value is 0.
//        10) the third loop completed own all iterations after comparing the current sum and the maxsum.
//        11) if the current sum is big to the maxsum so insert the current sum value to the maxsum variable and if not big does not insert.

//        function maximumSumAfterBRemovals(A: array of integers, B: integer) -> integer:
//        N = length of A
//        maxSum = 0
//
//        for i from 0 to B:
//        // Create two arrays to store the sum of elements from both sides of A
//        array1 = new array of size i
//                array2 = new array of size B - i
//
//        // Calculate the sum of the first i elements of A and store them in array1
//        sum1 = 0
//        for j from 0 to i-1:
//        array1[j] = A[j]
//        sum1 += A[j]
//
//        // Calculate the sum of the last B-i elements of A and store them in array2
//        sum2 = 0
//        for k from N-1 to N-B by -1:
//        array2[N-k-1] = A[k]
//        sum2 += A[k]
//
//        // Calculate the current sum by adding the elements of array1 and array2
//        currentSum = sum1 + sum2
//
//        // Update maxSum if the current sum is greater
//        maxSum = maximum of maxSum and currentSum
//
//        return maxSum



    }
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
