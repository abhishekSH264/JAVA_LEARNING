package CLASS.DSA_MODULE_3.DSA_Maths_Combinatorics_Basics_Prime_Numbers;


import java.util.*;

public class Find_Primes {
    //Bruteforce
    public static int factors(int A) {
        int count = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static ArrayList<Integer> bruteforce(int A) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 2; i <= A; i++) {
            if (factors(i) == 2) {
                al.add(i);
            }
        }
        return al;
    }

    public static ArrayList<Integer> solve(int A) {
        boolean[] arr = new boolean[A + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        for (int i = 2; i * i <= A; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= A; j+=i) {
                    arr[j] = false;
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            if(arr[i]){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int A = 10;
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
