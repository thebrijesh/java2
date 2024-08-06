package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    static int sizeTree = 0;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void displayTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " -> ");
        if (root.left != null) System.out.print(root.left.val + " ");
        if (root.right != null) System.out.print(root.right.val);
        System.out.println();
        displayTree(root.left);
        displayTree(root.right);
    }

    public static int size(TreeNode root) {
        if (root == null) return 0;

        return 1 + size(root.left) + size(root.right);
    }

    public static int sum(TreeNode root) {
        if (root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }



    public static int max(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE ;

        sum(root.left);
        sum(root.right);
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(TreeNode root, int n){
        if(root == null)return;
        if (n==1)System.out.print(root.val + " ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);

    }

    public static void bfs(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)queue.add(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.peek();
             
            if (temp.left != null ) {
                queue.add(temp.left);
            }
            if (temp.right != null ) {
                queue.add(temp.right);
            }
            System.out.println(temp.val);
            queue.remove();
        }
    }
    public static void main(String[] args) {

        TreeNode TreeNode = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);

        TreeNode.left = a;
        TreeNode.right = b;

        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);

        a.left = c;
        a.right = d;


        TreeNode e = new TreeNode(6);
        b.right = e;
        bfs(TreeNode);

    }
}
