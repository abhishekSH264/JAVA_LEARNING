package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

public class Max_Sum_Contiguous_Subarray {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int carryForward(int[] A) {
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int prefixArray(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = prefix[j];
                }else{
                    sum = prefix[j] - prefix[i-1];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static int solve(int[]A){
        int n = A.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int tempstart = 0;
        int end = -1;
        for(int i = 0; i < n; i++){
            sum+=A[i];
            if(maxSum < sum){
                maxSum = sum;
                start = tempstart;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                tempstart = i+1;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        int[] B = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] C = {-2, 3, 4, -1, 5, -10, 7};
        System.out.println(bruteforce(A));
        System.out.println(bruteforce(B));
        System.out.println(carryForward(A));
        System.out.println(carryForward(B));
        System.out.println(prefixArray(A));
        System.out.println(prefixArray(B));
        System.out.println(solve(A));
        System.out.println(solve(B));
        System.out.println(solve(C));
    }
}
