package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static Trees.Tree.TreeNode;

public class DeserializeBinaryTree {


    public static TreeNode arrayToTree(ArrayList<Integer> arr) {
        TreeNode root = new TreeNode(arr.get(0));

        int i = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (i < arr.size() - 1) {
            TreeNode temp = q.remove();
            TreeNode left = new TreeNode(0);
            TreeNode right = new TreeNode(0);

            if (arr.get(i) == -1){
                left = null;
            }else {
                left.val = arr.get(i);
                q.add(left);
            }
            if (arr.get(i+1) == -1){
                right = null;
            }else {
                right.val = arr.get(i+1);
                q.add(right);
            }
            temp.left = left;
            temp.right = right;

            i += 2;
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
