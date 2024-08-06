package Others;

import java.util.ArrayList;
import java.util.List;

public class SeparateOddEven {
    private static List<List<Integer>> separateOddEven(int[] arr) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (var num : arr) {
            if (num % 2 == 0) {
                list.add(num);
            } else {
                list1.add(num);
            }
        }
        mainList.add(list);
        mainList.add(list1);

        return mainList;
    }

    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5};
        int[] arry1 = {4,3,2};
        System.out.println(separateOddEven(arry));
        System.out.println(separateOddEven(arry1));
    }
}
