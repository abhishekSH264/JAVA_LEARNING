package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.HashMap;

public class Good_Pair {
    public static int solve(int[] A,int B) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static int solve2(int[] A,int B) {
        int n = A.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            int required = B - A[i];
            if(map.containsKey(required)){
                return 1;
            }
            map.put(A[i],i);
        }
        return 0;
    }
    public static int solve3(int[] A,int B) {
        int n = A.length;
        int i = 0, j = n-1;
        while(i<j){
            int sum = A[i] + A[j];
            if(sum==B){
                return 1;
            }else if(sum<B){
                i++;
            }else{
                j--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 7;
        System.out.println(solve(A,B));
        System.out.println(solve2(A,B));
        System.out.println(solve3(A,B));
    }
}
