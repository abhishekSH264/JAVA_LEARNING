package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_3_Interview_Problems;

public class First_Missing_Integer {
    public static int bruteforce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (A[j] == (i + 1)) {
                    flag = true;
                }
            }
            if (!flag) {
                return (i + 1);
            }
        }
        return (n + 1);
    }

    public static int solve(int[] A) {
        int n = A.length;
        //changing the negative and element 0 to infinity
        for (int i = 0; i < n; i++) {
            if (A[i] < 0 || A[i] == 0) {
                A[i] = Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<n;i++){
            int val = Math.abs(A[i]);
            if(val<=n){
                int index = val-1;
                A[index] = Math.abs(A[index])*-1;
            }
        }
        for(int i=0;i<n;i++){
            if(A[i] > 0){
                return (i+1);
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 0};
        int[] B = {3, 4, -1, 1};
        int[] C = {-8, -7, -6};
        int[] D = {1, 2, 3, 4};
//        System.out.println(bruteforce(A));
//        System.out.println(bruteforce(B));
//        System.out.println(bruteforce(C));
//        System.out.println(bruteforce(D));
        System.out.println(solve(B));
    }
}
