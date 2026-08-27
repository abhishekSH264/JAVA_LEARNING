package CLASS.DSA_MODULE_1.DSA_Introduction_to_Problem_Solving;

public class Find_Perfect_Numbers {
    public static int solve(int num) {
        if (num == 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i && other != num) {
                    sum += other;
                }
            }
        }
        return sum == num ? 1 : 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }
}
