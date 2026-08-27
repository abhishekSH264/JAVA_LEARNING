package STRIVERS.Linked_List.Doubly_Linked_list;

public class Deletion_in_DLL {
    static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public static void printForwardDll(Node head) {
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
        if (head.next == null) {
            return head.next;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.prev;
        temp.prev = null;
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        Node head = new Node(A[0]);
        Node temp = head;
        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            nn.prev = temp;
            temp = nn;
        }
        printForwardDll(head);
        printForwardDll(deleteHead(head));
        printForwardDll(deleteTail(head));
    }
}
