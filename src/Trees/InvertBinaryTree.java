package Trees;

public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void helper(TreeNode root){
        TreeNode left = root.right;
        TreeNode right = root.left;
        root.left = left;
        root.right = right;
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        helper(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);

        node.left = a;
        node.right = b;

        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);

        a.left = c;
        a.right = d;


        TreeNode e = new TreeNode(6);
        b.right = e;
        System.out.println(invertTree(node));
    }
}
