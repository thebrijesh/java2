package LinkedList;

import static LinkedList.implementation.*;
import static LinkedList.implementation.linkedlist.*;
import static LinkedList.implementation.ll;

public class Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        display(reverseKGroup(head, 2));
    }

    public static Node reverseKGroup(Node head, int k) {
              Node currStart = null;
              Node prevStart = null;
              Node ans = null;
              Node pre = null;
              Node curr = head;
              Node upcoming = null;
              boolean flag = true;
              while(flag){
                  int kD = k;
                  if(curr == head) {
                      kD = k;
                  }
                   currStart = curr;
                  while (kD != 0 && curr!= null){
                      upcoming = curr.next;
                      curr.next = pre;
                      pre = curr;
                      curr = upcoming;
                      kD--;
                  }
                  if(curr==null){
                      flag = false;
                  }
                  if(prevStart == null) {
                      ans = pre;
                      prevStart = currStart;
                  }else{
                      prevStart.next = pre;
                      prevStart = currStart;
                  }
              }
              prevStart.next = null;
              return ans;
    }
}
