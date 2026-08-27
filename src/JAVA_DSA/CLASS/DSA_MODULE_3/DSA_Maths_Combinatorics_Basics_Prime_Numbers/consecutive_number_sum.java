package CLASS.DSA_MODULE_3.DSA_Maths_Combinatorics_Basics_Prime_Numbers;

public class consecutive_number_sum {
    public static int bruteforce(int A){
        int count = 0;
        for (int i = 1; i <= A; i++){
            int sum = 0;
            for(int j = i; j <= A; j++){
                sum+=j;
                if(sum == A){
                    count++;
                    break;
                }
                if(sum > A) break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int A = 15;
        System.out.println(bruteforce(A));
    }
}
