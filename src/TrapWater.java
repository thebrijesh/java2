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
    public static void main(String[] args) {
        int[] height1 = {5,3,8,4,1,0,6,2};
        System.out.println(trap(height1)); // Output: 6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height2)); // Output: 9
    }
}
