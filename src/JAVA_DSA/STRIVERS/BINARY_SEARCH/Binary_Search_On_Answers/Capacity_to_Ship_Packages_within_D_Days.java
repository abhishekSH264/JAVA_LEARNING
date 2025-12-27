package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Capacity_to_Ship_Packages_within_D_Days {
    //Bruteforce
    public static int bruteforce(int[] A, int d) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        for (int i = max; i <= sum; i++) {
            if (isPossible(A, i, d)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPossible(int[] A, int x, int d) {
        int n = A.length;
        long weight = 0;
        int day = 1;
        for (int i = 0; i < n; i++) {
            if (weight + A[i] > x) {
                day++;
                weight = A[i];
            } else {
                weight += A[i];
            }
        }
        return day <= d;
    }

    public static int solve(int[] A, int d) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : A) {
            if (i > max) max = i;
            sum += i;
        }
        int start = max, end = sum, ans = max;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, mid, d)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 5, 2, 3, 4, 5, 6};
        int D = 5;
        System.out.println(bruteforce(A, D));
        System.out.println(solve(A, D));
    }
}
