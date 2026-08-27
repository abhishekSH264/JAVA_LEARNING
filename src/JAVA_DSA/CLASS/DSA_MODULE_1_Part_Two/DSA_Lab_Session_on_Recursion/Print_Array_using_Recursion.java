package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Print_Array_using_Recursion {
    //iterative
    public static void iterative(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void print(int[] A, int i, int n) {
        if (i == n) {
            return;
        }
        System.out.print(A[i] + " ");
        print(A, i + 1, n);
    }

    public static void solve(int[] A) {
        int n = A.length;
        int i = 0;
        print(A,i,n);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        iterative(A);
        solve(A);
    }
}
