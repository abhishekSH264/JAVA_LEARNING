package STRIVERS.Linked_List.Single_Linked_list;

import java.util.ArrayList;
import java.util.HexFormat;

public class Segregate_Even_Odd_linked_list {
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

    public static Node bruteforce(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp != null && temp.next != null) {
            al.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            al.add(temp.val);
        }
        temp = head.next;
        while (temp != null && temp.next != null) {
            al.add(temp.val);
            temp = temp.next.next;
        }
        if (temp != null) {
            al.add(temp.val);
        }
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = al.get(i++);
            temp = temp.next;
        }
        return head;
    }

    public static Node solve(Node head) {
        if (head == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next!=null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        Node head = new Node(A[0]);
        Node temp = head;

        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = nn;
        }
        printLL(head);
//        printLL(bruteforce(head));
        printLL(solve(head));

    }
}
