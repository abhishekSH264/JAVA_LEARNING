package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders_in_an_array {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int max = A[i];
            for(int j = i+1; j < n; j++){
                if(A[j] > max){
                    max = A[j];
                }
            }
            if(A[i]==max){
                ans.add(A[i]);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = A[n-1];
        for(int i = n-1; i >= 0; i--){
            if(A[i] > max){
                ans.add(max);
                max = A[i];
            }
        }
        ans.add(max);
        System.out.println(ans);
        int[] arr = new int[ans.size()];
        int k = 0;
        for(int i = ans.size()-1 ; i >=0 ; i--){
            arr[k] = ans.get(i);
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
