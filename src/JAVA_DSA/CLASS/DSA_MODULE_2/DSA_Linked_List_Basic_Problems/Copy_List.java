package CLASS.DSA_MODULE_2.DSA_Linked_List_Basic_Problems;

import java.util.*;


public class Copy_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode random;
        ListNode(int val){
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
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
    //simple copy the linkedlist
    public static ListNode copyLinkedList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode dnode = new ListNode(-1);
        ListNode res = dnode;
        ListNode temp = head;
        while (temp!=null) {
            ListNode cur = new ListNode(temp.val);
            res.next = cur;
            res = res.next;
            temp = temp.next;
        }
        return dnode.next;
    }
    //Copy Linked list with random pointers


    //1.Copy the Linked List with random Pointer using HashMap
    public static ListNode copyLinkedListUingHashMap(ListNode A){
        if(A==null){
            return A;
        }
        ListNode temp = A;
        HashMap<ListNode , ListNode > map = new HashMap<>();
        while (temp!=null) {
            ListNode nn = new ListNode(temp.val);
            map.put(temp, nn);
            temp = temp.next;
        }
        temp = A;
        ListNode dnode = new ListNode(-1);
        ListNode res = dnode;
        while (temp!=null) {
            res.next = map.get(temp);
            if(temp.random!=null){
                res.next.random = map.get(temp.random);
            }else{
                res.next.random = null;
            }
            res = res.next;
            temp = temp.next;
        }
        return dnode.next;
    }
    //copy the Linked without using hashmap
    public static ListNode copyRandomList(ListNode head){
        if(head==null){
            return head;
        }
        //created the new Noded
        ListNode temp = head;
        while (temp!=null) {
            ListNode nn = new ListNode(temp.val);
            nn.next = temp.next;
            temp.next = nn;
            temp = temp.next.next;
        }
        //attaching the random node
        temp = head;
        while (temp!=null) {
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        //deattach the nodes
        ListNode dnode = new ListNode(-1);
        ListNode copy = dnode;
        temp = head;
        while (temp!=null) {
            copy.next = temp.next;
            temp.next = temp.next.next;
            copy = copy.next;
            temp = temp.next;
        }
        return dnode.next;
    }
    public static void main(String[] args){
        int[] A = {10,20,30,40,50};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
        ListNode copylist = copyRandomList(head);
        print(copylist);
    }
    
}
