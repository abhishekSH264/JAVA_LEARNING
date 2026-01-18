package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.Arrays;
import java.util.HashMap;

//find the total number of subarray with sum equals to B;
public class Subarray_Sum_Equals_K {
    public static int solve(int[] A,int B) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]+A[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        for(int i=0;i<n;i++){
            int val = prefix[i];
            int need = val - B;
            if(map.containsKey(need)){
                count = count + map.get(need);
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(map);
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 1};
        int B = 1;
        int[] c = {0,0,0};
        int D = 0;
        System.out.println(solve(A,B));
        System.out.println(solve(c,D));
    }
}
