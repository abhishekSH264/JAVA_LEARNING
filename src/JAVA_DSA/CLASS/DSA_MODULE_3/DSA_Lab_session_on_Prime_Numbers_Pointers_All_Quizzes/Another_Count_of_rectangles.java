package CLASS.DSA_MODULE_3.DSA_Lab_session_on_Prime_Numbers_Pointers_All_Quizzes;

public class Another_Count_of_rectangles {
    public static int bruteforce(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(A[i] * A[j] < B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2};
        int B = 5;
        System.out.println(bruteforce(A,B));
    }
}
