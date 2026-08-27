package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class First_Index_using_Recursion {
    public static int indices(int[]A,int i,int B,int idx){
        if(i == A.length){
            return -1;
        }
        if(A[i] == B){
            return i;
        }
        return indices(A,i+1,B,idx);
    }
    public static int solve(int[]A,int B){
        int idx = -1, i = 0;
        return indices(A,i,B,idx);
    }
    public static void main(String[] args){
        int [] A = {-3, 5, 6, 2};
        int B = 6;
        System.out.println(solve(A,B));
    }
}
