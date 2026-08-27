package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Second_Largest {
    public static int solve(int[] A) {
        int n = A.length;
        int max = -1;
        int secondMax = -1;

        for (int i : A) {
            if(i > max){
                secondMax = max;
                max = i;
            }else if(i > secondMax && i < max){
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50, 60};
        int[] B = {12, 5, 87, 34, 2, 65};
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
