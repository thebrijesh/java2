package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int n = a.size();
        int m = b.size();
        if (n > m) return findMedianSortedArrays(b, a);

        int start = 0;
        int end = n;
        while (start <= end) {
            int mid1 = start + (end - start) / 2;
            int mid2 = ((n + m + 1) / 2) - mid1;

            int left1 = 0;
            int right1 = 0;
            int left2 = 0;
            int right2 = 0;
            if (mid1 > 0) left1 = a.get(mid1 - 1);
            else left1 = Integer.MIN_VALUE;
            if (mid2 > 0) left2 = b.get(mid2 - 1);
            else left2 = Integer.MIN_VALUE;
            if (mid1 < n) right1 = a.get(mid1);
            else right1 = Integer.MAX_VALUE;
            if (mid2 < m) right2 = b.get(mid2);
            else right2 = Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if ((n + m) % 2 == 0) {
                    return (double) ((Math.max(left2, left1) + Math.min(right2, right1)) / 2.0);
                } else {
                    return (double) (Math.max(left2, left1));
                }
            } else if (left1 > right2) {
                end = mid1 - 1;
            } else {
                start = mid1 + 1;
            }
        }
        return 0.0;

    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        List<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);
        B.add(4);
        System.out.println(findMedianSortedArrays(A, B));
    }
}
