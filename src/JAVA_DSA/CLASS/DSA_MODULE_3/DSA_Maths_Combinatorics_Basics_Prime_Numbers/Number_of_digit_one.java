package CLASS.DSA_MODULE_3.DSA_Maths_Combinatorics_Basics_Prime_Numbers;

public class Number_of_digit_one {
    public static int countOne(int num){
        int count = 0;
        while (num != 0){
            int d = num % 10;
            if(d == 1){
                count++;
            }
            num /= 10;
        }
        return count;
    }
    public static int bruteforce(int A){
        int count = 0;
        for(int i = 1; i <= A; i++){
            count+=countOne(i);
        }
        return count;
    }
    public static void main(String[] args){
        int A = 11;
        System.out.println(bruteforce(A));
    }
}
