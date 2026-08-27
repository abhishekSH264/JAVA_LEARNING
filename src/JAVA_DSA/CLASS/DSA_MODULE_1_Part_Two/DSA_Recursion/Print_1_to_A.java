package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class Print_1_to_A {
    //iterative way
    public static void iterative(int n){
        for(int i = 1; i < n; i++){
            System.out.print(i+" ");
        }
    }
    //recursive
    public static void solve(int n){
       if(n == 1){
           System.out.print(n+" ");
           return;
       }
       solve(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
//        iterative(n);
        solve(n);
    }
}
