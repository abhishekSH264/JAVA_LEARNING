package STRIVERS.Arrays;

public class Check_if_an_Array_is_Sorted {
    public static boolean solve(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            if(A[i] < A[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(solve(A));
    }
}
