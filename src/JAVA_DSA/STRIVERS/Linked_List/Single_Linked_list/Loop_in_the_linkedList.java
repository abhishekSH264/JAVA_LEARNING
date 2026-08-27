package STRIVERS.Linked_List.Single_Linked_list;

import java.util.HashMap;

public class Loop_in_the_linkedList {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    //bruteforce using HashMap;
    public static boolean isHavingLoop(Node head) {
        if (head == null) {
            return false;
        }
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return true;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    //Optimize one using the Slow and Fast Pointer
    public static boolean HavingLoop(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast  = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};

    }
}
