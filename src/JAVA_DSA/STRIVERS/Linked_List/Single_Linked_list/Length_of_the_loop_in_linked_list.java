package STRIVERS.Linked_List.Single_Linked_list;

import java.util.HashMap;

public class Length_of_the_loop_in_linked_list {
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

    //BruteForce using the hashmap
    public static int lengthofLoopBrute(Node head) {
        if (head == null) {
            return 0;
        }
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (map.containsKey(temp)) {
                return count - map.get(temp);
            }
            map.put(temp, count);
            temp = temp.next;
        }
        return 0;
    }

    public static int lengthOfLoop(Node head) {
        if (head == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int count = 1;
                slow = slow.next;
                while (slow != fast){
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
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
    }
}
