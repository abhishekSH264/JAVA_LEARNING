package STRIVERS.Linked_List.Single_Linked_list;

public class Middle_of_the_LL {
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

    public static Node MiddleNodeBruteforce(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = (count + 1) / 2;
        temp = head;
        while (temp != null) {
            middle--;
            if (middle == 0) {
                return temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node middleNode(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        Node head = new Node(A[0]);
        Node temp = head;
        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = nn;
        }
        printLL(head);
        System.out.println(MiddleNodeBruteforce(head).val);
        System.out.println(middleNode(head).val);
    }
}
