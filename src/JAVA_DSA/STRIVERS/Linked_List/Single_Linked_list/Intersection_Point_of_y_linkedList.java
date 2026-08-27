package STRIVERS.Linked_List.Single_Linked_list;

import java.util.HashMap;

public class Intersection_Point_of_y_linkedList {
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

    public static Node intersectPoint(Node head, Node head2) {
        if (head == null && head2 == null) {
            return null;
        }
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            map.put(temp, 1);
            temp = temp.next;
        }
        Node temp1 = head2;
        while (temp1 != null) {
            if(map.containsKey(temp1)){
                return temp1;
            }
            temp1 = temp1.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(4);
        Node n6 = new Node(6);
        Node n7 = new Node(2);
        Node head2 = new Node(3);
        Node n8 = new Node(1);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        head2.next = n8;
        n8.next = n5;
        printLL(head);
        printLL(head2);
        System.out.println(intersectPoint(head,head2).val);
    }
}
