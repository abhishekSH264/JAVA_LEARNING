package STRIVERS.Basic_Maths;

public class Count_The_Digits {

    public static int solve(int n){
        int count = 0;
        while(n !=0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1234;
        int n1 = -1234;
        System.out.println(solve(n));
        System.out.println(solve(n1));
    }
}
