package STRIVERS.Linked_List.Single_Linked_list;

import java.security.PublicKey;
import java.util.Stack;

public class Reverse_Linked_List {
    static class Node {
        int val;
        Node next;


        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void printLL(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Using the stack to reverse;
    public static Node reverseLLBruteForce(Node head) {
        if(head == null){
            return head;
        }
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null){
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }
    //Optimize Approach
    public static Node reverse(Node head){
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            Node nn = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nn;
        }
        return prev;
    }
    static void main() {
        int[] A = {1, 2, 3, 4, 5, 6};
        Node head = new Node(A[0]);
        Node temp = head;

        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = nn;
        }
        printLL(head);
//        printLL(reverseLLBruteForce(head));
        printLL(reverse(head));
    }

}
