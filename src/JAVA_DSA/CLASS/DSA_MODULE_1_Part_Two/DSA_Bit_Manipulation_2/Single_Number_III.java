package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation_2;

import java.util.Arrays;
import java.util.HashMap;

public class Single_Number_III {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        int[] arr = new int[2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arr[k] = A[i];
                k++;
            }
        }
        return arr;
    }

    public static int[] good(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = A[i];
            hs.put(ele,hs.getOrDefault(ele,0)+1);
        }
        System.out.println(hs);
        int[] arr = new int[2];
        int k = 0;
        for(int i=0;i<n;i++){
            int ele = A[i];
            if(hs.get(ele)==1){
                if(arr[k] > 0 && arr[k-1] > ele){
                    int temp = ele;
                    arr[k] = A[k-1];
                    arr[k-1] = ele;
                }else{
                    arr[k] = ele;
                    k++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 1, 2, 4};
        int[] B = {186,256,102,377,186,377};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(good(B)));
    }
}
