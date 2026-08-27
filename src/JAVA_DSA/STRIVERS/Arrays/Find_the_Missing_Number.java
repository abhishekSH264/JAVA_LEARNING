package STRIVERS.Arrays;

public class Find_the_Missing_Number {
    public static int bruteForce(int[] A) {
        int n = A.length + 1;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (A[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return n + 1;
    }

    public static int solve(int[] A) {
        int n = A.length;
        long expect = (long) n * (n + 1) / 2;
        long actual = 0;
        for(int i : A){
            actual+=i;
        }
        return (int) (expect - actual);
    }

    public static void main(String[] args) {
        int[] A = {8, 2, 4, 5, 3, 7, 1};
        int[] B = {0, 2, 3, 1, 4};
        System.out.println(bruteForce(A));
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
