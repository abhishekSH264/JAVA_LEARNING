package CLASS.DSA_MODULE_1.DSA_Introduction_to_Problem_Solving;

public class Find_Perfect_Numbers {
    public static int solve(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if(i!=n){
                    sum += i;
                }
                int other = n / i;
                if(other != i && other != n){
                    sum+=other;
                }
            }
        }
        if(sum==n){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }
}
