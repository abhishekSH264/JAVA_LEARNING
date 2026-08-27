package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Linear_Search_Multiple_Occurences {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2};
        int B = 2;
        System.out.println(solve(A, B));
    }
}
