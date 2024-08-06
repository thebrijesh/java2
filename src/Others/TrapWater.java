package Others;

public class TrapWater {
    public static void pseudocode() {
//        https://leetcode.com/problems/trapping-rain-water/
//        declare the first loop
//        n= h.length
//        leftmax =0 ;
//        rightmax = 0;
//        trapwater = 0;
//        for i from 0 to n

//        declare the second loop under the first loop

//        for j from I to 0 (I>0,i--)
//        compare left max and h[I]; larger value add in leftmax.

//        declare the third loop after the second loop

//        for k from I to n
//        compare right max and h[I]. larger value add in rightmax.
//
//        after both loops iterations were completed compare leftmax and rightmax.
//        subtraction of between  minimum value and h[I].
//        and adds in trapwater.(addition).
    }
    public static int trap(int[] height) {
        int totalWater = 0;
        int n = height.length;

        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // Find the maximum height on the left side (including the current bar)
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find the maximum height on the right side (including the current bar)
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Calculate the amount of water trapped at the current bar
            int trappedWater = Math.min(leftMax, rightMax) - height[i];

            // Add the trapped water to the total water
            totalWater += trappedWater;
        }

        return totalWater;
    }

    public static int trap2(int[] height) {

        int
                l = 0,
                r = height.length - 1,
                sum = 0,
                leftBar = height[l],
                rightBar = height[r];

        while (l < r) {
            if (leftBar <= rightBar) {
                sum += leftBar - height[l];
                l++;
                leftBar = Math.max(leftBar, height[l]);
            } else {
                sum += rightBar - height[r];
                r--;
                rightBar = Math.max(rightBar, height[r]);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap2(height1)); // Output: 6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height2)); // Output: 9
    }
}
