package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.ArrayToTree.arrayToTree;
import static Trees.Tree.TreeNode;

public class VerticalOrderTraversal {
    static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    static ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {


//        helper(root,list2D,map,new ArrayList<>(),0,0);
        lorder(root);
        System.out.println(map);
        return list2D;
    }

    private static void helper(TreeNode root, ArrayList<ArrayList<Integer>> list2D, HashMap<Integer, ArrayList<Integer>> map, ArrayList<Integer> vlist, int lval, int rval) {
        if (root == null) return;


        if (!map.containsKey(rval)) {
            map.put(rval, new ArrayList<>());
        }
        vlist = map.get(rval);

        vlist.add(root.val);
        map.put(rval, vlist);


        helper(root.left, list2D, map, vlist, lval + 1, rval - 1);
        helper(root.right, list2D, map, vlist, lval + 1, rval + 1);

    }

    static class pair {
        public boolean val;
        TreeNode t;
        int idx;

        public pair(TreeNode t, int idx) {
            this.t = t;
            this.idx = idx;
        }
    }

    public static void lorder(TreeNode root) {
        Queue<pair> queue = new LinkedList<>();
        if (root != null) queue.add(new pair(root, 0));

        while (!queue.isEmpty()) {
            pair temp = queue.poll();

            if (temp.t.left != null) {
                queue.add(new pair(temp.t.left, temp.idx - 1));
            }
            if (temp.t.right != null) {
                queue.add(new pair(temp.t.right, temp.idx + 1));
            }
            if (!map.containsKey(temp.idx)) {
                map.put(temp.idx, new ArrayList<>());
            }
            ArrayList<Integer> vlist = map.get(temp.idx);

            vlist.add(temp.t.val);
            map.put(temp.idx, vlist);


        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num: map.keySet()) {
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        for (int i = min; i <=max ; i++) {
            ArrayList<Integer>listt = map.get(i);
            list2D.add(listt);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };

        TreeNode root = arrayToTree(arr);
        System.out.println(verticalOrderTraversal(root));


    }
}
