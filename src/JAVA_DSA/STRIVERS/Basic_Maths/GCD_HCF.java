package STRIVERS.Basic_Maths;

public class GCD_HCF {
    //1.Approach One
    public static int solve(int n1 , int n2){
        int n = Math.min(n1,n2);
        int gcd = 0;
        for(int i = 1; i <=n; i++){
            if(n1%i==0&&n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    //2.Approach Two
    public static int solve1(int n1,int n2){
        int n = Math.min(n1,n2);
        for(int i = n; i >= 1; i--){
            if(n1%i==0&&n2%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int n1 = 24;
        int n2 = 36;
        System.out.println(solve(n1,n2));
        System.out.println(solve1(n1,n2));
    }
}
