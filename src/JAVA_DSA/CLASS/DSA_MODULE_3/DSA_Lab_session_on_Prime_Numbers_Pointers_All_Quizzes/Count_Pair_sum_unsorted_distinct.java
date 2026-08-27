package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.lang.*;
import java.util.*;

public class Count_Pair_sum_unsorted_distinct {
    //Bruteforce
    public static int bruteForce(int[] A, int K) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(A[i] + A[j] == K){
                    count++;
                }
            }
        }
        return count;
    }
    //Optimize approach
    public static int solve(int[]A,int K){
        int n = A.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int target = K - A[i];
            if(set.contains(target)){
                count++;
            }
            set.add(A[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {3, 5, 1, 2, 1, 2};
        int K = 8;
    }
}
