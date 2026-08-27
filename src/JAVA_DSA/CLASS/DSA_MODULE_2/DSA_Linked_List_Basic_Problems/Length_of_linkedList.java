package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

import CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation.Help_From_Sam;

public class Length_of_linkedList {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            Node next = null;
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

    public static int lengthOffLL(Node head) {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
        System.out.println(lengthOffLL(head));
    }
}
