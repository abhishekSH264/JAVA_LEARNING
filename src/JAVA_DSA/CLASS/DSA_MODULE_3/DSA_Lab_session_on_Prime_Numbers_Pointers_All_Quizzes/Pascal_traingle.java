package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

import java.util.Arrays;

public class Pascal_traingle {
    public static int[][] solve(int A) {
        int[][] arr = new int[A][A];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int A = 5;
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
