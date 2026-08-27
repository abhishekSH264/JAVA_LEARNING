package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

import java.util.ArrayList;
import java.util.Collections;

public class Find_the_smallest {
    public static int solve(int[]A,int B){
        int n = A.length;
        ArrayList<Long> al = new ArrayList<>();

        for(int i = 0 ; i < n; i ++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    al.add((long)A[i] + A[j] + A[k]);
                }
            }
        }
        Collections.sort(al);
        return (int)(long)al.get(B-1);
    }
    static void main() {
        int[]A  = {2, 4, 3, 2};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
