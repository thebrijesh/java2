package leetcode;

import java.util.Arrays;

public class PerfectSquares {
    public static int numSquares(int n) {
        long[] arr = new long[100000001];
        for (int i = 1; i <= 10000; i++) {
            arr[(i * i)] = i;
        }
        long ans = 0;
        int lastVal = 0;
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 1 && arr[i] > 0 && n % i == 0) {
                ans = n / i;
            }
            if (ans != 0) break;
        }
        if (ans == 0) {
            for (int i = 4; i < arr.length; i++) {
                if (arr[i] > 0) {
                    ans += i;
                    count++;
                    if (ans == n) {
                        break;
                    }
                    if (ans > n) {
                        while (ans > n) {
                            if (arr[j] > 0 ) {
                                ans -= arr[j];
                                count--;
                            }
                            j++;
                        }
                    }
                }

            }

            ans = count;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(15));
    }
}
