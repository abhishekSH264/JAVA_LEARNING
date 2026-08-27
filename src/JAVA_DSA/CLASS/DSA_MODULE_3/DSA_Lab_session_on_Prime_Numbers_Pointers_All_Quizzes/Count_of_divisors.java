package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.Arrays;

public class Count_of_divisors {
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

    public static int[] bruteforce(int[] A) {
        int n = A.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = factors(A[i]);
        }
        return arr;
    }

    //Optimize approach using the sieve method;
    public static int[] solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            if (i > max) max = i;
        }
        int[] arr = new int[max + 1];
        Arrays.fill(arr, 2);
        arr[0] = arr[1] = 1;

        for (int i = 2; i <= max; i++) {
            for (int j = 2 * i; j <= max; j += i) {
                arr[j] = arr[j] + 1;
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[A[i]];
        }
        return ans;
    }

    static void main(String[] args) {
        int[] A = {2, 3, 4, 5};
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
