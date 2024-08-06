package LinkedList;

import java.util.List;

public class Reverse {
    public static void display(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || head == null) {
            return head;
        }
        int i = 1;
        ListNode node;
        ListNode mhead = head;
        while (i < left - 1) {
            head = head.next;
            i++;
        }
        node = head;
        ListNode list2 = head.next;
        ListNode upcoming = null;
        ListNode curr = head.next;
        ListNode pre = head;
        if (left == 1) {
            pre = null;
            curr = head;
            list2 = head;
            i--;
        }

        while (i != right && curr != null) {
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;
            i++;
        }
        if (left == 1) {
            mhead = pre;
        } else {
            node.next = pre;
        }
        list2.next = curr;
        return mhead;
    }

//    public static ListNode reverse(ListNode node, int rIdx,int left) {
//        ListNode temp = node;
//        ListNode upcoming = null;
//        ListNode curr = node.next;
//        ListNode pre = node;
//        int i = 0;
//        while (i != rIdx && curr != null) {
//            upcoming = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = upcoming;
//            i++;
//        }
//        temp = pre;
//        return curr;
//    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        display(reverseBetween(node1, 3, 4));
    }
}
