package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.HashMap;

public class Count_Subarray_Zero_Sum {
    public static int solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        long count = 0;
        for (int i = 0; i < n; i++) {
            int val = prefix[i];
            int need = val - 0;
            if(map.containsKey(need)){
                count = (count + map.get(need))%1000000007;
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return (int) count;
    }

    public static void main(String[] args) {
        int[] A = {1, -1, -2, 2};
        System.out.println(solve(A));
    }
}
