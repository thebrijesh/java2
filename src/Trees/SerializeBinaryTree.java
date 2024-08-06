package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.ArrayToTree.arrayToTree;
import static Trees.Tree.TreeNode;

public class SerializeBinaryTree {
    public static ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();


            list.add(temp.val);


            if (temp.left != null) {
                queue.add(temp.left);
            } else {
                if (temp.val != -1) {
                    queue.add(new TreeNode(-1));
                }

            }
            if (temp.right != null) {
                queue.add(temp.right);
            } else {
                if (temp.val != -1) {
                    queue.add(new TreeNode(-1));
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "null", "6", "null", "null", "null", "null", "null", "null"};

        TreeNode root = arrayToTree(arr);
        System.out.println(solve(root));
    }
}
