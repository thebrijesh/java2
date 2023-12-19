package LinkedList;

public class IntersectionOfTwoLinkedLists {


    public static implementation.Node getIntersectionNode(implementation.Node head) {
        implementation.Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int mod = count;
        count = count / 2;
        temp = head;
        while (temp != null) {


            if (count == 1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count--;
        }
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
        return temp;

    }


    public static void main(String[] args) {
        implementation.linkedlist ll = new implementation.linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);



        getIntersectionNode(ll.head);


    }

}
