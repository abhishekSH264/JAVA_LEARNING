package STRIVERS.Arrays;

public class Linear_Search_in_C {
    public static int solve(int[] A,int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if(A[i] == K){
                return i;
            }
        }
        return -1;
    }

    static void main() {
        int[] A = {1, 2, 3, 4, 5};
        int K = 3;
    }
}
