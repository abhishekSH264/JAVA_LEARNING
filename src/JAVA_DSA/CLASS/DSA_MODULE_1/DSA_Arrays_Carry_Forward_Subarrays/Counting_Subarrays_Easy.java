package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Counting_Subarrays_Easy {

    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum+=A[k];
                }
                if(sum < B){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static int betterBruteforce(int[] A, int B) {
        int n = A.length;
        int ans = 0;
        for(int i = 0; i < n; i ++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum+=A[j];
                if(sum < B){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;
        System.out.println(bruteforce(A,B));
        System.out.println(betterBruteforce(A,B));
    }
}
