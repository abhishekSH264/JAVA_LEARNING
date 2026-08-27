package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class Search_in_LinkedList {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean isPresent(Node head, int K) {
        if(head == null){
            return false;
        }
        Node temp = head;
        while (temp!=null){
            if(temp.val == K){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    static void main() {
        int[] A = {1, 2, 3, 4, 5, 6};
        Node head = new Node(1);
        Node temp = head;
        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = temp.next;
        }
        System.out.println(isPresent(head,8));
    }
}
