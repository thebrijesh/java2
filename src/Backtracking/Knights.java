package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Knights {
    public static void main(String[] args) {

        List<List<Integer>>list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(6);
        list.get(0).add(4);

        list.get(1).add(6);
        list.get(1).add(8);

        list.get(2).add(9);
        list.get(2).add(7);

        list.get(3).add(4);
        list.get(3).add(8);

        list.get(4).add(9);
        list.get(4).add(3);
        list.get(4).add(0);

        list.get(6).add(0);
        list.get(6).add(1);
        list.get(6).add(7);

        list.get(7).add(2);
        list.get(7).add(6);

        list.get(8).add(3);
        list.get(8).add(1);

        list.get(9).add(2);
        list.get(9).add(4);
        count = 0;
        int n = 3;
        for (int i = 0; i <= 9; i++) {
            solve(list,i, n-1);
        }
        System.out.println(count);;
    }
    static int count = 0;
    public static void solve(List<List<Integer>>list, int i, int n){
        if(n == 0) {
            count++;
            return;
        }
        for (int j = 0; j < list.get(i).size(); j++) {
            int x = list.get(i).get(j);
            solve(list,x,n-1);
        }
    }
}
