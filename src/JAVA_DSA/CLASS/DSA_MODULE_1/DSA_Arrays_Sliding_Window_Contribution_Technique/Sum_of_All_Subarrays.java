package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Sum_of_All_Subarrays {
    public static int bruteForce(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                ans += sum;
            }
        }
        return ans;
    }

    public static int better(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                ans += sum;
            }
        }
        return ans;
    }

    public static int prefix(int[] A) {
        int n = A.length;
        int ans = 0;
        int[] psum = new int[n];
        psum[0] = A[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + A[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    ans += psum[j];
                } else {
                    ans += psum[j] - psum[i - 1];
                }
            }
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans+=A[i] * ((i+1)*(n - i));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(bruteForce(A));
        System.out.println(better(A));
        System.out.println(prefix(A));
        System.out.println(solve(A));

    }
}
