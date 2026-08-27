package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class Reverse_Link_List_II {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //printing the LinkedList
    public static void print(ListNode head){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while (temp!=null) {
           System.out.print(temp.val+" "); 
           temp = temp.next;
        }
        System.out.println();
        
    }
    //reversing the Linked List
    public static ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp!=null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    //get the Kth Node
    public static ListNode getKthode(ListNode head,int K){
        if(head==null){
            return head;
        }
        ListNode temp = head;
        while (temp!=null) {
            K--;
            if(K==0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
    }
}
