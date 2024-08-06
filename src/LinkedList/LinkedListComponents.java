package LinkedList;

import java.util.HashSet;

public class LinkedListComponents extends Reverse {
    // 0 1 2 3 4 5
    // 5 3 1 0
    public static int numComponents(ListNode head, int[] nums) {
        int count = 0;
        boolean flag = false;
        HashSet<Integer> set = new HashSet<>(10001);
        for (var num : nums) {
            set.add(num);
        }
        while (head != null) {


            if (set.contains(head.val)) {
                if (!flag) {
                    count++;
                    flag = true;

                }

            } else {
                flag = false;
            }


            head = head.next;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 0};
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(numComponents(node1, nums));
    }

}
