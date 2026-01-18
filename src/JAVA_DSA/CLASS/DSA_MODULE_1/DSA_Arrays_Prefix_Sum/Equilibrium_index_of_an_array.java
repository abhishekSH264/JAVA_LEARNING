package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

public class Equilibrium_index_of_an_array {
    public static int solve(int[] A) {
        int n = A.length;
        int[] psum = new int[n];
        int[] ssum = new int[n];

        psum[0] = A[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + A[i];
        }
        ssum[n-1] = A[n-1];
        for(int i = n-2;i>=0;i--){
            ssum[i] = ssum[i+1]+A[i];
        }
        for(int i = 1; i < n-1;i++){
            if(psum[i-1]==ssum[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }
}
