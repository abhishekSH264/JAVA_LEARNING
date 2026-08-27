package CLASS.DSA_MODULE_1_Part_Two.DSA_Recursion;

public class Print_A_to_1 {
    //iterative
    public static void iterative(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" ");
        }
    }

    //recursive
    public static void solve(int n) {
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        solve(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        iterative(n);
        solve(n);
    }
}
