package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.HashSet;

public class Count_Pair_sum_sorted_and_distinct {
    //BruteForce
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(A[i]+A[j] == K){
                    count++;
                }
            }
        }
        return count;
    }
    //Better Using HashMap
    public static int better(int[]A,int K){
        int n = A.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : A){
            int target = K - i;
            if(set.contains(target)){
                count++;
            }
            set.add(i);
        }
        return count;
    }
    //Optimize approach
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1;
        int count = 0;

        while (start < end){
            int sum = A[start]+A[end];
            if(sum == K){
                count++;
                start++;end--;
            }else if(sum < K){
                start++;
            }else {
                end--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int K = 9;
        System.out.println(bruteforce(A,K));
        System.out.println(better(A,K));
        System.out.println(solve(A,K));
    }
}
