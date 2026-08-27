package STRIVERS.Linked_List.Single_Linked_list;

public class Delete_middle_Element_of_Linked_list {
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

    public static Node removeMiddle(Node head) {
        if (head == null) return head;
        if (head.next == null) return null;

        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        int middle = (count + 1) / 2;

        temp = head;
        for (int i = 1; i < middle - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node remvoMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
        public static void main (String[]args){
            int[] A = {1, 2, 3, 4, 5};
            Node head = new Node(A[0]);
            Node temp = head;

            for (int i = 1; i < A.length; i++) {
                Node nn = new Node(A[i]);
                temp.next = nn;
                temp = nn;
            }
            printLL(head);
            printLL(removeMiddle(head));
        }
    }
