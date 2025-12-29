package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Counting_Subarrays_Easy {
    public static int bruteforce(int[] A,int B) {
        int n = A.length;
        int count = 0;
        for (int s = 0; s < n; s++) {
            int sum = 0;
            for(int e = s; e < n; e++){
                sum+=A[e];
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
        System.out.println(bruteforce(A,B));
    }
}
