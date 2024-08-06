package LinkedList;

import static LinkedList.implementation.*;
import static LinkedList.implementation.linkedlist.*;
//5,2,6,3,9,1,7,3,8,4
//5,6,2,3,9,1,4,8,3,7
public class RemoveDuplicates {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(2);
        ll.insertAtEnd(6);
        ll.insertAtEnd(3);
        ll.insertAtEnd(9);
        ll.insertAtEnd(1);
        ll.insertAtEnd(7);
        ll.insertAtEnd(3);
        ll.insertAtEnd(8);
        ll.insertAtEnd(4);
   display(reverseEvenLengthGroups(head));

    }

    public static Node reverseEvenLengthGroups(Node head) {
        int mcount = size(head)-1;
        int count1 = 1;
        int count2 = 0;
        Node temp = head;
        while (head != null) {
            count2 = 0;
            if ((count1+1 > mcount && mcount % 2 == 0) || ((count1 + 1) % 2) == 0) {
                Node curr = head.next;
                Node hnext = head.next;

                while (curr != null && count2 != count1) {
                    curr = curr.next;
                    count2++;
                }
                Node upcoming = null;
                if (curr == null) {
                    upcoming = null;
                } else {
                    upcoming = curr.next;
                    curr.next = null;
                }

                Node t = head.next;
                head.next = reverse(head.next);
                hnext.next = upcoming;
                if (upcoming == null) head = null;
                else head = t;
            } else {

                while (head != null && count2 != count1) {
                    head = head.next;
                    count2++;
                }
            }
            count1++;
            mcount -= count1;

        }
        return temp;

    }

    public static int size(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static Node reverse(Node head) {
        Node pre = null;
        Node curr = head;
        Node upcoming = null;
        while (curr != null) {
            upcoming = curr.next;
            curr.next = pre;
            pre = curr;
            curr = upcoming;
        }
        return pre;
    }
}
