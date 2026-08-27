package STRIVERS.Linked_List.Single_Linked_list;

import java.util.List;

public class Remove_Duplicates_From_Sorted_list {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void printLL(ListNode head){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static ListNode removeDuplicates(ListNode A){
        if(A == null){
            return A;
        }
        ListNode temp = A;
        while (temp!=null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return A;
    }
    public static void main(String[] args){
        int[] A = {1,1,2,2,3,3};
        ListNode head = new ListNode(A[0]);
        ListNode temp = head;
        for(int i = 1; i < A.length; i++){
            ListNode nn = new ListNode(A[i]);
            temp.next = nn;
            temp = nn;
        }
        printLL(removeDuplicates(head));
    }
}
