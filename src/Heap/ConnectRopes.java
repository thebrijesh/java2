package Heap;

import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static int solve(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : A) {
            pq.add(val);
        }
        int ans = 0;
        while (pq.size() > 1){
            int a = pq.remove();
            int b = pq.remove();
            ans += a+b;
            pq.add(a + b);
        }
        return ans;
    }
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>();
        for (ListNode node:a) {
            pq.add(node);
        }
        ListNode node = pq.remove();
        ListNode ans = node;

        while (pq.size() > 1){

            while (node != null){
                node = node.next;
            }
            pq.remove();
            node.next = pq.peek();
        }
        return ans;
    }
    public static void fun(int[] A,int idx){
        while(idx < A.length) {
            int left = (idx * 2) +1, right = left + 1, min = A[idx];
            if(left > A.length && right > A.length) break;
            if(left < A.length) {
                min = Math.min(min, A[left]);
            }
            if(right < A.length) {
                min = Math.min(min, A[right]);
            }
            if(min == A[idx]) break;
            if(min == A[left]) {
                A[left] = A[idx];
                A[idx] = min;
                idx = left;
            }
            if(min == A[right]) {
                A[right] = A[idx];
                A[idx] = min;
                idx = right;
            }
        }
    }
    public static int[] buildHeap(int[] A) {
        int i =0;
        for (int j = A.length-1; j >=0; j--) {
            fun(A, j);
        }

        return A;
    }
    public static void main(String[] args) {

        int[] arr = {5, 13, -2, 11, 27, 31, 0, 19};
        System.out.println(Arrays.toString(buildHeap(arr)));
    }
}
