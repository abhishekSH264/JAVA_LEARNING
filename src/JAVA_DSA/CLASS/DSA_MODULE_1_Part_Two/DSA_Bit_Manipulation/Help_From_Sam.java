package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

public class Help_From_Sam {
    public static int solve(int A){
        int count = 0;
        for(int i=0;i<32;i++){
            if((A & (1 << i))>0){
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
