package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Last_Index_using_Recursion {
    //
    public static int indices(int[] A, int B, int i, int idx) {
        if (i == A.length) {
            return idx;
        }
        if (A[i] == B) {
            idx = i;
        }
        return indices(A, B, i+1, idx);
    }

    public static int solve(int[] A, int B) {
        int i = 0, idx = -1;
        return indices(A,B,i,idx);
    }

    public static void main(String[] args) {
        int[] A = {6, 5, 6, 2};
        int B = 6;
        System.out.println(solve(A,B));
    }
}
