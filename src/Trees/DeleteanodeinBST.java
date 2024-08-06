package Trees;

import static Trees.ArrayToTree.arrayToTree;
import static Trees.Tree.TreeNode;

public class DeleteanodeinBST {

    public static void main(String[] args) {
        String[] arr = {"5","3","7","2","4","6","8","1","null","null"};

        TreeNode root = arrayToTree(arr);
        inOrder(root);
        searchBST(root,6);
    }
    private static void inOrder(TreeNode root){
        if (root == null)return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val > val) root.left = searchBST(root.left, val);
        else if (root.val < val) root.right = searchBST(root.right, val);
        else {
            if (root.left != null && root.right != null) {
                int lMax = max(root.left);
                root.val = lMax;
                root.left = searchBST(root.left, lMax);
            } else if (root.left != null) {
                root = root.left;

            } else if (root.right != null) {
                root = root.right;

            } else {
                root = null;
            }


        }

        return root;
    }

    private static int max(TreeNode root) {
        if (root.right != null) {
            return max(root.right);
        } else {
            return root.val;
        }
    }


}
