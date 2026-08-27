package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class K_reverse_linked_list {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //print the Linked list
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
    //Reverse the K LinkedList

    //1.reverse the LinkedList
    public static ListNode reverseLinkedList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode temp = head;
        ListNode next = head;
        ListNode prev = null;
        while (temp!=null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    //return the Kth Node
    public static ListNode getKthNode(ListNode temp,int K){
        if(temp==null){
            return null;
        }
        while (temp!=null) {
            K--;
            if(K==0){
                break;
            }
            temp = temp.next;
        }
        return temp;

    }
    public static ListNode reversek(ListNode head,int B){
        if(head==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp!=null) {
            ListNode kthNode = getKthNode(temp, B);
            if(kthNode==null){
                if(prev!=null){
                    prev.next = temp;
                }
                break;
            }
            ListNode next = kthNode.next;
            kthNode.next = null;
            ListNode newhead = reverseLinkedList(temp);
            if(temp==head){
                head = newhead;
            }else{
                prev.next = newhead;
            }
            prev = temp;
            temp = next;
        }
        return head;
    }    
    public static void main(String[] args){
    int[] A = {10,20,30,40,50,60,70};
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
