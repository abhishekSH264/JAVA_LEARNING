package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.HashMap;
import java.util.HashSet;

public class Check_Pair_sum_for_sorted_arrays_and_distinct_elements {
    //BruteForce
    public static int bruteforce(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(A[i]+A[j] == K){
                    return 1;
                }
            }
        }
        return 0;
    }
    //Using the Hashing method

    public static int better(int[]A,int K){
        int n = A.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : A){
            int target = K - i;
            if(set.contains(target)){
                return 1;
            }
            set.add(i);
        }
        return 0;
    }
    //Using the Two Pointers Approach
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1;
        while (start < end){
            int sum = A[start] + A[end];
            if(sum == K){
                return 1;
            } else if (sum < K) {
                start++;
            }else{
                end--;
            }
        }
        return 0;
    }
    static void main() {
        int[] A = {3, 7, 8, 11, 14, 19, 20};
        int K = 25;
        System.out.println(bruteforce(A,K));
        System.out.println(better(A,K));
        System.out.println(solve(A,K));
    }
}
