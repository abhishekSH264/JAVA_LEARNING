package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Counting_Subarrays_Easy {

    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++){
                sum+=A[j];
                if(sum < B){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;
        System.out.println(solve(A, B));
    }
}
