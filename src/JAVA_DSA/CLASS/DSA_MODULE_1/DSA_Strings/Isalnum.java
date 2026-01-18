package CLASS.DSA_MODULE_1.DSA_Strings;

public class Isalnum {
    public static int solve(char[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if(!((A[i]>='A'&&A[i]<='Z')||(A[i]>='a'&&A[i]<='z')||(A[i]>='0'&&A[i]<='9'))){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        char[] A = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(solve(A));
    }
}
