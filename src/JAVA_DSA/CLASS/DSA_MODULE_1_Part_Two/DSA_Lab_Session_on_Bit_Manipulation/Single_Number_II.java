package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Single_Number_II {
    public static boolean checkbit(int n, int i) {
        int val = n & (1 << i);
        if (val == 0) {
            return false;
        }
        return true;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int j = 0; j < n; j++){
                if(checkbit(A[j],i)){
                    total++;
                }
            }
            if(total % 3 !=0){
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        System.out.println(solve(A));
    }

}
