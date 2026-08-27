package CLASS.DSA_MODULE_2.DSA_Lab_Session_on_Binary_Searching;

public class Ath_th_magical_number {
    public static int bruteforce(int A, int B, int C) {
        int count = 0;
        int number = 2;
        while (count <= A) {
            if (number % 2 == 0 || number % 3 == 0){
                count++;
                if(count == A){
                    break;
                }
            }
            number++;
        }
        return number;
    }

    static void main() {
        int A = 4, B = 2, C = 3;
        System.out.println(bruteforce(A,B,C));
    }
}
