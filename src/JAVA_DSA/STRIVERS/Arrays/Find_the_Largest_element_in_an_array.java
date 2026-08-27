package STRIVERS.Arrays;

public class Find_the_Largest_element_in_an_array {
    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,A[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 1, 3, 0};
        System.out.println(solve(A));
    }
}
