package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Trees.Tree.TreeNode;

public class LevelOrder {
    public static int[][] solve(TreeNode root) {
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        int level = 1;
        int count = 1;
        int nextNull = 0;
        int currNull = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();

            if (temp.left != null) {
                queue.add(temp.left);
            } else {
                nextNull++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
            } else {
               nextNull++;
            }
            list.add(temp.val);
            if (level == count+currNull) {
                list2D.add(list);
                list = new ArrayList<>();
                level = level * 2;
                count = 0;
                currNull = nextNull;
                nextNull *= 2;
            }
            queue.remove();
            count++;
        }
        int[][] arr2d = new int[list2D.size()][];
        int j = 0;
        for (ArrayList<Integer> list1 : list2D) {
            int[] arr = new int[list1.size()];
            int i = 0;
            for (var num : list1) {
                arr[i++] = num;
            }
            arr2d[j++] = arr;
        }
        return arr2d;
    }
    public static void main(String[] args) {

    }
}
