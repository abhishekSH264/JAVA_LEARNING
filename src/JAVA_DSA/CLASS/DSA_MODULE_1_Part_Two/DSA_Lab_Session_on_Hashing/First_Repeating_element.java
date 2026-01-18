package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;

import java.util.HashMap;

public class First_Repeating_element {
    public static int solve(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        int ele = -1;
        for(int i=n-1;i>=0;i--){
            int key = A[i];
            if(map.get(key)>1){
                ele = key;
                break;
            }
        }
        return ele;
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(solve(A));
    }
}
