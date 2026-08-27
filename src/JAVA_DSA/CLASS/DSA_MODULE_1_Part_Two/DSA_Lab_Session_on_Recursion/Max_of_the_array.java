package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Max_of_the_array {
    //recursive
    public static int maxElement(int[] A, int i, int max) {
        if (i == A.length) {
            return max;
        }
        max = Math.max(max, A[i]);
        return maxElement(A, i + 1, max);
    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        return maxElement(A,0,max);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(solve(A));
    }
}
