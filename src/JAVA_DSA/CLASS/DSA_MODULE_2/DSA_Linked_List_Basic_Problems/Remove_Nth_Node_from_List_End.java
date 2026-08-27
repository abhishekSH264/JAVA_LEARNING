package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

public class Remove_Nth_Node_from_List_End {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //printing the Linkedlist
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
    //remove the nth node from the List
    public static ListNode removeNthNode(ListNode A,int B){
        if(A==null){
            return A;
        }
        int count = 0;
        ListNode temp = A;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        int pos = count - B;
        temp = A;
        if(B>=count){
            return A.next;
        }
        while (temp!=null) {
            pos--;
            if(pos==0){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return A;
    }
    //remove the Nth Node in Onepass;
    public static ListNode remove(ListNode A, int B){
        if(A==null){
            return A;
        }
        ListNode fast = A;
        ListNode slow = A;;
        int i = 0;
        while (fast!=null&&i<B) {
            fast = fast.next;
            i++;
        }
        if(fast==null){
            return A.next;
        }
        while (fast!=null) {
            if(fast.next==null){
                slow.next = slow.next.next;
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }
    
        return A;
    }
    public static void main(String[] args){
        int[] A = {10,20,30,40,50,60};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
        ListNode remove = remove(head, 1);
        print(remove);
    }
}
