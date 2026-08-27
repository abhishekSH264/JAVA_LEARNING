package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

/*
        Ye jo problem hai wo eek purane problem joki humlog bit manupulation me
        solve kiye the waisa he hai.
        1.Iska bruteforce hai ki frequency count karlenge agar count 1 aya to return karenge
        2.Thoda better me jayenge to Hashing ka bhe use kar sakte hai ye  - TC O(n)
        3.Xor Ka use kar ke sare elements ko XOr Kar denge and Single element milega - TC - O(n)
        4.Binary Search use kar ke TC ko O(log n) kar lenge

        For binary Search Rules and Regulations
        1.pehle hum start ko 0 and end ko n-1 pe initialize karenge then hum mid calculte karenge
        isme eek bahu bada observation and catch hai ki unique element se pehle sare elements ka
        starting index even hai and unique elements ke baad odd hai
        to sable pehle jab hum mid nikalenge tab hum check karenge ki mid-1 jo hai A[mid] ke
        barabar hai to mid ko mid-1 kar denge
        2.uske baad mid element ko check karenge ki kya wo unique hai uske liye eek unique
        naam ka function bana lenge aur usme condition ke basis pe true false return karenge
        3.agar unique to ans variable me save kar lenge
        4.agar mid odd hai to end = mid -1 nahee to start - mid +1
         */

import java.util.HashMap;

public class Single_Element_in_Sorted_Array {
    public static int bruteforce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] == A[i]) {
                    count++;
                }
            }
            if (count == 1) {
                return A[i];
            }
        }
        return -1;
    }

    public static int better1(int[] A) {
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

    public static int better2(int[] A) {
        int n = A.length;
        int a = 0;

        for (int i = 0; i < n; i++) {
            a = a ^ A[i];
        }
        return a;
    }

    public static int solve(int[] A) {
        int n = A.length;
        if (A[0] != A[1]) {
            return A[0];
        } else if (A[n - 1] != A[n - 2]) {
            return A[n - 1];
        }
        int start = 1, end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1]) {
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
        int[] A = {1, 1, 7};
        int[] B = {1, 1, 2, 2, 3};
        System.out.println(bruteforce(A));
        System.out.println(bruteforce(B));
        System.out.println(better1(A));
        System.out.println(better1(B));
        System.out.println(better2(A));
        System.out.println(better2(B));
        System.out.println(solve(A));
        System.out.println(solve(B));
    }

}
