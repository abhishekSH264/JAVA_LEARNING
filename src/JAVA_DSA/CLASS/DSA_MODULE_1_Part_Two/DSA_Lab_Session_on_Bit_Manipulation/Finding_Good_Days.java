package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Bit_Manipulation;

public class Finding_Good_Days {
    public static boolean checkbit(int n , int i){
        int val = n & (1 << i);
        if(val==0){
            return false;
        }
        return true;
    }
    public static int solve(int n ){
        int count = 0;
        for(int i=0;i<32;i++){
            if(checkbit(n,i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(solve(n));
    }
}
