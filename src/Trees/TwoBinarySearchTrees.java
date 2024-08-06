package Trees;

import java.util.ArrayList;
import java.util.List;

import static Trees.ArrayToTree.arrayToBst;
import static Trees.ArrayToTree.inOrder;
import static Trees.Tree.TreeNode;

public class TwoBinarySearchTrees {

    static List<Integer> list = new ArrayList<>();

    public static TreeNode pred(TreeNode curr1) {
        TreeNode curr = curr1.left;
        TreeNode pred = curr1;
        while (curr.right != null && curr.right != pred) {
            curr = curr.right;
        }
        if (curr.right == null) {
            curr.right = pred;
            pred = pred.left;
        }

        if (curr.right == pred) {
            curr.right = null;
            list.add(pred.val);
            pred = pred.right;
        }
        return pred;
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeNode curr1 = root1;
        TreeNode curr2 = root2;

        while (curr1 != null && curr2 != null) {
            if (curr1.left != null) {

                curr1 = pred(curr1);

            } else {
                list.add(curr1.val);
                curr1 = curr1.right;
            }
            if (curr2.left != null) {

                curr2 = pred(curr2);

            } else {
                list.add(curr2.val);
                curr2 = curr2.right;
            }
        }
        while (curr1 != null) {
            if (curr1.left != null) {

                curr1 = pred(curr1);

            } else {
                list.add(curr1.val);
                curr1 = curr1.right;
            }

        }

        while (curr2 != null) {
            if (curr2.left != null) {

                curr2 = pred(curr2);

            } else {
                list.add(curr2.val);
                curr2 = curr2.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17};

        TreeNode root = arrayToBst(array, 0, array.length - 1);
        TreeNode root1 = arrayToBst(array1, 0, array1.length - 1);
        inOrder(root);
        System.out.println();
        inOrder(root1);
        List<Integer> list = getAllElements(root, root1);
        System.out.println(list);

        System.out.println(list);
    }

}
