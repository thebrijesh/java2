package leetcode;

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
public class CanPlaceFlowers {

    public static int canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int start = 0;
        int value =0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (start != i) {
                if (flowerbed[i] == 1){
                    value = i - (start+1);
                    if (value % 3 == 0){
                        count += value/3;
                    }
                    start =i;
//                    if ()
                }


            }


        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(arr, 2));
    }

}
