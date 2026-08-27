package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

import java.util.HashSet;

public class Remove_Duplicates_from_Sorted_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //print linkedList
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
    //reverse the LinkedList
    public static ListNode reverseLinkedList(ListNode A){
        if(A==null){
            return A;
        }
        ListNode temp = A;
        while (temp!=null) {
            if(temp.next!=null&&temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return A;
    }
    //Remove the Duplicates from the unsorted List
    public static ListNode removeDuplicates(ListNode A){
        if(A==null){
            return A;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode temp = A;
        ListNode prev = null;
        while (temp!=null) {
            if(set.contains(temp.val)){
                prev.next = temp.next;
                temp = temp.next;
            }else{
                set.add(temp.val);
                prev = temp;
                temp = temp.next;
            }
        }
        return A;
    }
    public static void main(String[] args){
        int[] A = {1,70,70,60,70};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
        ListNode removed = removeDuplicates(head);
        print(removed);
    }
}
