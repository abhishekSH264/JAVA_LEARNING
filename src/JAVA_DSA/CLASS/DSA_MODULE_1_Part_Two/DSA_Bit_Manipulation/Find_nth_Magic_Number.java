package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Find_nth_Magic_Number {
    public static int solve(int A){
        int power = 5;
        int result = 0;
        for(int i=0;i<32;i++){
            if((A & (1 << i)) > 0){
                result +=power;
            }
            power*=5;
        }
        return result;
    }
    public static void main(String[] args){
        int A = 3;
    }
}
