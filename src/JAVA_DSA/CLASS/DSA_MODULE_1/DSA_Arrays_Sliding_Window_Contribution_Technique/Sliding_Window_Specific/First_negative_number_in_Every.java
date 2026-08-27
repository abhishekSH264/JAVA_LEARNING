package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique.Sliding_Window_Specific;

import java.lang.reflect.Array;
import java.util.*;

public class First_negative_number_in_Every {
    public static ArrayList<Integer> bruteForce(int[] A, int K) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i <= n - K; i++) {
            int ele = 0;
            for(int j = i; j < i + K; j++){
                if(A[j] < 0){
                    ele = A[j];
                    break;
                }
            }
            al.add(ele);
        }
        return al;
    }
    public static ArrayList<Integer> solve(int[]A,int K){
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();

        int i = 0, j = 0;
        while (j < n){
            if(A[j] < 0){
                qu.offer(A[j]);
            }
            int len = j - i + 1;
            if(len < K){
                j++;
            }else if(len == K){
                if(!qu.isEmpty()){
                    al.add(qu.peek());

                }else{
                    al.add(0);
                }
                if(!qu.isEmpty() && qu.peek()==A[i]){
                    qu.poll();
                }

                i++;j++;
            }
        }
        return al;
    }
    static void main() {
        int[] A = {12, -1, -7, 8, -15, 30, 16, 28};
        int B = 3;
        System.out.println(bruteForce(A,B));
        System.out.println(solve(A, B));
    }
}
