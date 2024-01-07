package Backtracking;

import java.util.*;
import java.lang.*;

public class GrayCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t) {
            int n = sc.nextInt();
            System.out.println(solve(n));
            t--;
        }

    }

    public static int solve(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        int ans = n % 2;


        int num = solve(n / 2);
        num = (num * 10) + ans;


        return  num;
    }

}   