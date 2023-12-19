package leetcode;

public class AverageWaitingTime {

    public static double averageWaitingTime(int[][] nums) {
        int arriveTime = nums[0][0];
        int finishTime = nums[0][0] + nums[0][1];
        int waitingTime = finishTime - arriveTime;

        for (int i = 1; i < nums.length; i++) {
            arriveTime = nums[i][0];
            if (arriveTime > finishTime + nums[i][1]) {
                finishTime = nums[i][0] + nums[i][1];
            } else {
                finishTime += nums[i][1];
            }

            waitingTime += finishTime - arriveTime;

        }
        return (double) waitingTime / (double) nums.length;
    }

    public static void main(String[] args) {
        int[][] nums = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        averageWaitingTime(nums);
    }
}
