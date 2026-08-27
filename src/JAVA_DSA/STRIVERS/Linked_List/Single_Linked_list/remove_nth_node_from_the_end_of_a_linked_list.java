package STRIVERS.Linked_List.Single_Linked_list;

public class remove_nth_node_from_the_end_of_a_linked_list {
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

    public static Node bruteFroce(Node head, int K) {
        if (head == null) {
            return head;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (K > count) {
            return head;
        }
        if (count == K) {
            return head.next;
        }
        int len = count - K;
        temp = head;
        for (int i = 1; i < count - K; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val);
        temp.next = temp.next.next;
        return head;
    }

    public static Node solve(Node head, int K) {
        if (head == null) {
            return head;
        }
        Node fast = head;
        for (int i = 1; i <= K; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        Node slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
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
//        printLL(head);
        printLL(bruteFroce(head, 2));
    }
}
