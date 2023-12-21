package Recursion;

import java.util.Arrays;

public class TowerOfHanoi {
    static int idx = 0;
    public static int[][] towerOfHanoi(int A) {
        int[][] arr = oneToLast(A,1,2,3,new int[(1 << A) -1][3]);
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }

    private static int[][] oneToLast(int A, int start, int mid, int end, int[][] nums) {
        if(A == 0)return nums;
        oneToLast(A-1,start,end,mid,nums);
        nums[idx][0] = A;
        nums[idx][1] = start;
        nums[idx++][2] = end;
        oneToLast(A-1,mid,start,end,nums);
        return nums;
    }

    public static void main(String[] args) {
        towerOfHanoi(4);
    }
}
