package CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Stacks;

public class Implement_Stack_using_array {
    public class stack {
        int[] arr;
        int size;
        int top;

        public stack(int n) {
            this.arr = new int[n];
            this.top = -1;
            this.size = n;
        }

        public boolean isFull() {
            return top == size - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top--];
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }
    }
}
