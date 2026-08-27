package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Max_Min_of_an_Array {
    public static int solve(int[] A){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : A){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        return max + min;
    }
    public static void main(String[] args){
        int[]A = {-2, 1, -4, 5, 3};
        System.out.println(solve(A));
    }
}
