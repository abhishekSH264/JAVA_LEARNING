package STRIVERS.Arrays;

public class Find_Second_Smallest_and_Second_Largest_Element_in_an_array {
    public static int solve(int[] A) {
        int n = A.length;
        int max = -1;
        int secMax = -1;
        for (int i = 0; i < n; i++) {
            if(A[i] > max){
                secMax = max;
                max = A[i];
            }else if(A[i] > secMax && A[i] < max){
                secMax = A[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 7, 7, 5};
        System.out.println(solve(A));

    }
}
