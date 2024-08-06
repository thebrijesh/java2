package Trees;

import java.util.LinkedList;
import java.util.Queue;

import static Trees.Tree.bfs;
import static Trees.Tree.TreeNode;

public class ArrayToTree {



    public static TreeNode arrayToTree(String[] arr) {
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
//        TreeNode left = new TreeNode(Integer.parseInt(arr[j]));
//        TreeNode right = new TreeNode(Integer.parseInt(arr[k]));
        int i = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (i < arr.length - 1) {
            TreeNode temp = q.remove();
            TreeNode left = new TreeNode(0);
            TreeNode right = new TreeNode(0);

            if (arr[i].equals("null")){
                left = null;
            }else {
                left.val = Integer.parseInt(arr[i]);
                q.add(left);
            }
            if (arr[i+1].equals("null")){
                right = null;
            }else {
                right.val = Integer.parseInt(arr[i+1]);
                q.add(right);
            }
            temp.left = left;
            temp.right = right;

            i += 2;
        }
       //bfs(root);
        return root;
    }

    public static TreeNode arrayToBst(int[] arr, int start, int end){
        if (start > end)return null;
        int mid = start + (end - start)/2;
        int val = arr[mid];
        TreeNode left = arrayToBst(arr,start,mid-1);
        TreeNode right = arrayToBst(arr,mid+1,end);

        TreeNode root = new TreeNode(val,left,right);
        return root;

    }
    public static void inOrder(TreeNode root){
        if (root == null)return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        String[] arr = {"1", "2", " 3", "4", "5", "null", "6", "null", "7", "null", "null", "8", "null", "null", "null", "9", "null"};
        arrayToTree(arr);
        int[] array = {1,2,3,4,5,6,7,8,9};
        TreeNode root = arrayToBst(array,0,array.length-1);
        inOrder(root);

    }
}
