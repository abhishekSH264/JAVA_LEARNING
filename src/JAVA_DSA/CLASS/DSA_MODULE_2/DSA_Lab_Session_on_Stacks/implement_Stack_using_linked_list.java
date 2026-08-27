package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Stacks;


public class implement_Stack_using_linked_list {
    public class node{
        int val;
        node next;
        public node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public class stack{
        node top;
        public stack(){
            this.top = null;
        }

        public void push(int x){
            node nn = new node(x);
            top.next = nn;
            top = nn;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = top.val;
            top = top.next;
            return x;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.val;

        }
        public boolean isEmpty(){
            return top==null;
        }
    }
}
