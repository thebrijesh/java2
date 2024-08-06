package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.Tree.TreeNode;

public class ZigZagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        int level = 1;
        int count = 1;
        int nextNull = 0;
        int currNull = 0;
        int l = 1;

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
            if (l % 2 == 0){
                list.add(0,temp.val);
            }else {
                list.add(temp.val);
            }

            if (level == count+currNull) {
                list2D.add(list);
                list = new ArrayList<>();
                level = level * 2;
                count = 0;
                currNull = nextNull;
                nextNull *= 2;
                l++;
            }
            queue.remove();
            count++;
        }

        return list2D;
    }
    public static void main(String[] args) {

    }
}
