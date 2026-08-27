package STRIVERS.Linked_List.Single_Linked_list;

import java.util.HashMap;

public class Starting_Point_Of_the_Loop_in_LL {
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

    //Bruteforce using the HashMap
    public static Node findStartingPoint(Node head) {
        if (head == null) {
            return head;
        }
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return temp;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }
    //Using the Tortoise and Hare Algorithm
    public static Node startingPoint(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
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
        System.out.println(startingPoint(head).val);
    }
}
