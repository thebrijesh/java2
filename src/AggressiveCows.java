public class AggressiveCows {

    public static int aggressiveCows(int []stalls, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //    Write your code here.
        for(int i = 0; i<stalls.length; i++){

            max =  Math.max(max, stalls[i]);
            min = Math.min(min, stalls[i]);

        }

        System.out.println(max + " " + min);
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr  = {1,2,3,4};
        int k = 2;
        System.out.println(aggressiveCows(arr,k));
    }
}
