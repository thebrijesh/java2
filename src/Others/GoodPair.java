package Others;

import java.util.HashMap;
import java.util.Map;

public class GoodPair {
//    For this problem solve I will use a hashmap
//    to declare the for each loop.
//    declare the hashmap.
//    check conditon -> traget - num = exsist in hasmap. if is true so return 1.
//    after checking the condition put the element in the hashmap key or value is 1.

    private static int goodPair(int []arr, int b){
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int num:arr) {
            b = b-num;
            if (myMap.containsKey(b)) {
                return 1;
            }
            myMap.put(num,1);
        }
       return 0;
    }
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6};
        int B = 7;
        System.out.println(goodPair(arry,B));

    }
}
