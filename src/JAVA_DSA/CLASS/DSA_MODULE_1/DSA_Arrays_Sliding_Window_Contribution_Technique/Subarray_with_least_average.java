package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Subarray_with_least_average {
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int start = 0;
        int end = B - 1;
        int index = -1;
        double average = Double.MAX_VALUE;
        while (end < n){
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += A[i];
            }
            double avg = (double) sum / B;
            if (avg < average) {
                average = avg;
                index = start;
            }
            start++;end++;
        }
        return index;
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        long sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        double average = (double) sum / B;
        int minIndex = 0;
        int start = 1;
        int end = B;
        while (end < n) {
            sum = sum - A[start - 1] + A[end];
            double avg = (double)sum / B;
            if(avg < average){
                average = avg;
                minIndex = start;
            }
            start++;end++;
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(bruteforce(A, B));
        System.out.println(solve(A,B));
    }
}
