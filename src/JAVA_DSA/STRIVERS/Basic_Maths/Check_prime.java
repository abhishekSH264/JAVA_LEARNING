package STRIVERS.Basic_Maths;

public class Check_prime {
    public static int factors(int n){
        int count = 0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 11;
        if(factors(n)==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
