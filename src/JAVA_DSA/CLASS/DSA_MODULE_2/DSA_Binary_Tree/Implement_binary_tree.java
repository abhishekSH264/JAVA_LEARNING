package CLASS.DSA_MODULE_2.DSA_Binary_Tree;

public class Implement_binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(21);
        root.left.right = new Node(22);
        root.right.left = new Node(31);
        root.right.right = new Node(32);
        preorder(root);
    }
}
