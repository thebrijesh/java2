package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindPlayers_2225 {

    public static List<List<Integer>> findWinners(int[][] matches) {
        int[] arr = new int[10000];
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list);
        for (var num: matches) {
            arr[num[1]]++;
            set.add(num[1]);
            set.add(num[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0 && set.contains(i)){
                list1.add(i);
            } else if (arr[i] == 1 && set.contains(i)) {
                list2.add(i);
            }
        }
        list.add(list1);
        list.add(list2);
       return list;
    }

    public static List<List<Integer>> optomizedFindWinners(int[][] matches) {
        int[] losses = new int[100001];

        for (int[] match : matches) {
            int win = match[0];
            int loss = match[1];

            if (losses[win] == 0) {
                losses[win] = -1;
            }

            if (losses[loss] == -1) {
                losses[loss] = 1;
            } else {
                losses[loss]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,3},{1,3},{5,4},{6,4}};
        findWinners(arr);
    }
}
