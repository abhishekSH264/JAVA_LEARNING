package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.HashMap;

public class Longest_Subarray_Zero_Sum {
    public static int solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]+A[i];
        }
        int maxlen = Integer.MIN_VALUE;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            long sum = prefix[i];
            if(sum==0){
                maxlen = Math.max(maxlen,i+1);
            } else if (map.containsKey(sum)) {
                maxlen = Math.max(maxlen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return (int) maxlen;
    }

    public static void main(String[] args) {
        int[] A = {1, -2, 1, 2};
        System.out.println(solve(A));
    }
}
