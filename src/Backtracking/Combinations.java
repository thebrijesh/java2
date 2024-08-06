package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
//    static int count = 0;
//    static int count1 = 0;

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 4;
        int k = 2;
//        int kk = k;
//        int nn = n;
//        System.out.println(solve(n, k, nn, list, kk));
        System.out.println(combine(n, k));

    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
        }
    }

//    static List<Integer> list1 = new ArrayList<>();

//    public static List<List<Integer>> solve(int n, int k, int nn, List<List<Integer>> list, int kk) {
//        count1++;
//        if (k == 1) {
//            k = kk;
//            count++;
//            list1.add(count);
//            list.add(list1);
//            list1 = new ArrayList<>();
//            return list;
//        }
//        if (nn == count1) {
//            n = n - 1;
//        }
//
//        list1.add(n);
//        solve(n - 1, k - 1, nn, list, kk);
//
//        solve(n, k, nn, list, kk);
//        return list;
//    }
}
