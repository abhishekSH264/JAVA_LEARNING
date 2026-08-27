package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

import java.util.Enumeration;
import java.util.List;

public class Delete_in_Linked_List {
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

    public static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        return head.next;
    }

    public static Node deleteTail(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node deleteKthNode(Node head, int K) {
        if(head == null){
            return head;
        }
        if(K == 0){
            return head.next;
        }
        Node temp = head;
        int count = 0;
        while (temp!=null && count < K - 1){
            temp = temp.next;
            count++;
        }
        if(temp!=null&& temp.next!=null){
            temp.next = temp.next.next;
        }
        return head;
    }
    public static Node deleteKthValueNod(Node head,int val){
        if(head == null){
            return head;
        }
        if(head.val == val){
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            if(temp.val == val){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
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
//        printLL(deleteHead(head));
//        printLL(deleteTail(head));
        printLL(deleteKthNode(head , 6));
    }
}
