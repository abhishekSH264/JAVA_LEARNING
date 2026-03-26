package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

import java.util.HashMap;

public class Single_element_in_a_Sorted_Array {
    //Bruteforce
    public static int brute(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }
        return -1;
    }

    //HashMap
    public static int better(int[] A) {
        int n = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(A[i]) == 1) {
                return A[i];
            }
        }
        return -1;
    }

    //Using the XOR
    public static int better2(int[] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans = ans ^ A[i];
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        if(A[0]!=A[1]){
            return A[0];
        }
        if(A[n-1]!=A[n-2]){
            return A[n-1];
        }
        int start = 1,end = n-2;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid]!=A[mid-1]&&A[mid]!=A[mid+1]){
                return A[mid];
            }
            if(A[mid]==A[mid-1]){
                mid = mid-1;
            }
            if(mid%2==0){
                start = mid+2;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(brute(A));
        System.out.println(better(A));
        System.out.println(better2(A));
        System.out.println(solve(A));
    }
}
