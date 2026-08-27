package STRIVERS.Linked_List.Single_Linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class sort_the_linked_list {
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

    public static Node sortBruteForce(Node head) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> al = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(al);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = al.get(i++);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] A = {1, 12, 4, 18, 69, 70};
        Node head = new Node(A[0]);
        Node temp = head;

        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = nn;
        }
        printLL(head);
        printLL(sortBruteForce(head));
    }
}
