package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Subarray_with_least_average {

    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        double ans = Double.MAX_VALUE;
        int start = 0, end = B - 1;
        int index = -1;
        while (end < n) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum+= A[i];
            }
            double average = (double)sum / B;
            if(average < ans){
                ans = average;
                index = start;
            }
            start++;end++;
        }
        return index;
    }
    public static int solve(int[]A,int B){
        int n = A.length;
        double ans = Double.MAX_VALUE;
        long sum = 0;
        int index = -1;
        for(int i = 0; i < B; i ++){
            sum += A[i];
        }
        double average = (double) sum / B;
        if(average < ans){
            ans = average;
            index = 0;
        }
        int start = 1,end = B;
        while(end < n){
            sum = sum - A[start-1] + A[end];
            average = (double)sum / B;
            if(average < ans){
                ans = average;
                index = start;
            }
            start++;end++;
        }
        return index;
    }
    public static int solve2(int[]A,int B){
        int n = A.length;
        long sum = 0;
        long ans = Long.MAX_VALUE;
        int index = -1;
        for(int i = 0 ; i < B; i ++){
            sum+=A[i];
        }
        if(sum < ans){
            ans = sum;
            index = 0;
        }
        int start = 1,end = B;
        while(end < n){
            sum = sum - A[start-1] + A[end];
            if(sum < ans){
                ans = sum;
                index = start;
            }
            start++;end++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A,B));
        System.out.println(solve2(A,B));
    }
}
