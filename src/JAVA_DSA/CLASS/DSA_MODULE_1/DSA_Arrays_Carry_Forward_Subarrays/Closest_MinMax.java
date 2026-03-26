package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Closest_MinMax {

    public static int bruteforce(int[]A){
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i : A){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        for(int i = 0; i < n; i ++){
            boolean ismax = false;
            boolean ismin = false;
            for(int j = i; j < n; j ++){
                int length = j - i + 1;
                if(A[j]== max) ismax = true;
                if(A[j] == min) ismin = true;
                if(ismax && ismin){
                    ans = Math.min(ans, length);
                }
            }
        }
        return ans;
    }
    public static int solve(int[]A){
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i : A){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        int maxIndex = -1;
        int minIndex = -1;
        for(int i = 0; i < n ; i ++){
            if(A[i]==max){
                maxIndex = i;
                if(minIndex !=-1){
                    ans = Math.min(ans,maxIndex - minIndex + 1);
                }
            }
            if(A[i]==min){
                minIndex = i;
                if(maxIndex !=-1){
                    ans = Math.min(ans,minIndex - maxIndex + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
