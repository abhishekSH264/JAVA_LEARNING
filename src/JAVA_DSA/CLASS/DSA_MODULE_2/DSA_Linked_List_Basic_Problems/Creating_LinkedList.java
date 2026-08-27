package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class Creating_LinkedList {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
        public static void printList(Node head){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        static void main() {
            int[] A = {1,2,3,4,5,6};
            Node head = new Node(A[0]);
            Node cur = head;

            for(int i = 1; i < A.length; i ++){
                Node nn = new Node(A[i]);
                cur.next = nn;
                cur = cur.next;
            }
            printList(head);
        }
    
}
