package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class Inserting_in_Linked_List {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node insertAtHead(Node head, int val) {
        Node nn = new Node(val);
        if (head == null) {
            return nn;
        }
        nn.next = head;
        head = nn;
        return head;
    }

    public static Node insertAtTail(Node head, int val) {
        Node nn = new Node(val);
        if (head == null) {
            return nn;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }

    public static Node insertKthNode(Node head, int val, int K) {
        Node nn = new Node(val);
        if (head == null) {
            if (K == 0) {
                return nn;
            }else{
                return head;
            }
        }
        if (K == 0){
            nn.next = head;
            head = nn;
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp.next!=null && count < K - 1){
            temp = temp.next;
            count++;
        }
        nn.next = temp.next;
        temp.next = nn;
        return head;
    }
    public static Node insertBeforeValue(Node head,int val,int K){
        Node nn = new Node(val);
        if(head == null){
            return head;
        }
        if(head.val == K){
            nn.next = head;
            head = nn;
            return head;
        }
        Node temp = head;
        while (temp.next!=null){
            if(temp.next.val == K){
                nn.next = temp.next;
                temp.next = nn;
                break;
            }
            temp = temp.next;
        }
        return head;
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

    static void main() {
        int[] A = {1, 2, 3, 4, 5, 6};
        Node head = new Node(A[0]);
        Node temp = head;
        for (int i = 1; i < A.length; i++) {
            Node nn = new Node(A[i]);
            temp.next = nn;
            temp = nn;
        }
//        printLL(head);
//        printLL(insertAtHead(head, 12));
//        printLL(insertAtTail(head, 22));
//        printLL(insertKthNode(head,10,5));
        printLL(insertBeforeValue(head,111,2));
    }

}
