package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Time_to_equality {
    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i : A){
            if(i  > max) max = i;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum  += max - A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]A = {2, 4, 1, 3, 2};
        System.out.println(solve(A));
    }
}
