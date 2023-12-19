package InterviewBit;

import java.util.*;

public class NextSmallestPalindrome {


    static int bar(int x, int y) {
        System.out.println("bar : " + x + " " + y);
        if (y == 0) return 0;

        int returnn = (x + bar(x, y - 1));
        System.out.println("return bar : " + returnn);

        return returnn;

    }

    static int foo(int x, int y) {
        System.out.println("foo : " + x + " " + y);
        if (y == 0) return 1;

        int retu = bar(x, foo(x, y - 1));
        System.out.println("return foo : " + retu);
        return retu;
    }

    public static int findAthFibonacci(int A) {
        System.out.println("A = " + A);
        if (A == 0 || A == 1) {
            System.out.println(" return value : " + A);
            return A;
        }
        int ans1 = findAthFibonacci(A - 1);
        System.out.println("A = " + A + " " + "ans1 = " + ans1);

        int ans2 = findAthFibonacci(A - 2);
        System.out.println("A = " + A + " " + "ans2 = " + ans2);

        int sum = ans1 + ans2;
        System.out.println("sum = " + sum);

        return sum;
    }

    public static int fun(int n) {
        if (n == 0) {
            return n;
        }


        int sum = 0;
        if (n % 2 == 0) {
            int ans = fun(n - 1) - n;
            System.out.println(ans);
            return ans;
        } else {
            int ans = fun(n - 1) + n;
            System.out.println(ans);
            return ans;
        }

    }

    public static int triangularSum(int[] nums) {
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] != -1) {
                    int curr = nums[j];
                    nums[j] = nums[j] + pre;
                    if (nums[j] + pre > 9) {
                        nums[j] = nums[j] % 10;
                    }
                    pre = curr;
                }

            }
            pre = nums[i];
            nums[i - 1] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(foo(3,5));
//        findAthFibonacci(6);
        System.out.println(fun(10));
//        int[] arr = {1,2,3,4,5};
//        System.out.println(triangularSum(arr));

    }
}
