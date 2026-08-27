package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Is_magic {
    public static int digits(int n) {
        if(n == 0){
            return 0;
        }
        return n % 10 + digits(n/10);
    }

    public static int solve(int A) {
        if(A<=9){
            if(A==1){
                return 1;
            }else{
                return 0;
            }
        }
        return solve(digits(A));
    }

    public static void main(String[] args) {
        int n = 83557;
        System.out.println(solve(n));
    }
}
