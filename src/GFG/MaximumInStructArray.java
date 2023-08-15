package GFG;

class Height {
    int feet;
    int inches;

    public Height(int ft, int inc) {
        feet = ft;
        inches = inc;
    }
}

public class MaximumInStructArray {


    public static int findMax(Height arr[], int n) {
        int ans = 0;
        int max = 0;

        for (var hight : arr) {
            ans = hight.feet * 12 + hight.inches;
            max = Math.max(max, ans);
        }

        return max;
    }

    public static void main(String[] args) {
        Height height = new Height(1, 2);
        Height height1 = new Height(2, 1);

        Height[] arr = {height, height1};

        System.out.println(findMax(arr, 2));
    }
}
