package LinkedList;

import static LinkedList.implementation.linkedlist.display;
import static LinkedList.implementation.linkedlist.head;

public class implementation {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
        }
        Node(){

        }
    }
    public static class linkedlist{
        public static Node head ;
         Node tail ;
         int size = 0;
         void insertAtEnd(int val){
             Node temp = new Node(val);

             if(head == null){
                 head = temp;

             }else {
                 tail.next = temp;

             }
             tail = temp;
             size++;
         }
         void insertAtBeginning(int val){
             Node newHead = new Node(val);

             if (head == null) head = tail = newHead;
             else {
                 newHead.next = head;
                 head = newHead;
             }
             size++;
         }
         void insertAt(int index , int val){
             Node newHead = new Node(val);
             Node temp = head;
             int count = 1;
             if(index == size()){
                 insertAtEnd(val);
                 return;
             }
             if(index == 0){
                 insertAtBeginning(val);
                 return;
             }
             while (count < index){
                 temp = temp.next;
                 count++;
             }
             newHead.next = temp.next;
             temp.next = newHead;
             size++;
         }
         public static void display(Node head){
             Node temp = linkedlist.head;
             while (temp != null){
                 System.out.println(temp.data+" ");
                 temp = temp.next;
             }
         }

         void deleteAt(int idx){
             Node temp = head;
             for (int i = 0; i < idx; i++) {
                 temp = temp.next;
             }
             temp.next = temp.next.next;
             if (idx == size-1)tail = temp;
             if (idx == 0) {
                 head = head.next;
             }
             size--;
         }

         int getAt(int a){
             Node temp = head;
             for (int i = 0; i <= a; i++){
                 temp = temp.next;
             }
             return temp.data;
         }

         int size(){
             return size;
         }
    }
    public static linkedlist ll = new linkedlist();
    public static void main(String[] args) {

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);



    }
}
