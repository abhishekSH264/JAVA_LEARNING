package STRIVERS.Basic_Maths;

public class Check_if_the_Number_is_Armstrong {
    public static boolean solve(int n) {
        int arm = 0;
        int x = n;
        while (x != 0){
            int digit  = x % 10;
            arm += digit * digit * digit;
            x /= 10;
        }
        return arm==n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(solve(n));
    }
}
