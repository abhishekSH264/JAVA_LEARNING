package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

import java.util.Stack;

public class Reverse_Linked_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //print Linkedlist
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
    //reverse linkedlist using stack
    public static ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp!=null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }
    //reverse the Linked list without stacks
    public static ListNode reverseLinkedlist(ListNode A){
        if(A==null){
            return A;
        }
        ListNode temp = A;
        ListNode next = A;
        ListNode prev = null;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public static void main(String[] args){
        int[]A = {10,20,30,40,50,60};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
        ListNode reverse = reverse(head);
        print(reverse);
    }

}
