package leetcode;

import java.util.ArrayList;

public class FindTheWinner {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int count = 0;

        int index = 0;
        int i = 0;int start = 0;
        while (list.size() > 1) {
            count++;
            if (count == k) {
                list.remove(i);
                count = 0;
                i--;
            }
            if (i >= list.size() - 1) i = -1;
            i++;

            start = index + k-1;
            index=start % list.size();
            list.remove(index);
        }


        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 3));
    }
}
