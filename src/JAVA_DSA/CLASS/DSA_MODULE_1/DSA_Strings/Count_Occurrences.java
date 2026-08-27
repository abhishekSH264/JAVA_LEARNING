package CLASS.DSA_MODULE_1.DSA_Strings;

public class Count_Occurrences {
    public static int bruteforce(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(s.substring(i,j+1).equals("bob")){
                    count++;
                }
            }
        }
        return count;
    }
    public static int solve(String s){
        int n = s.length();
        String match = "bob";
        int count = 0;
        for(int i = 0; i <= n - match.length();i++){
            if(s.substring(i,i+3).equals(match)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abobc";
        System.out.println(bruteforce(s));
        System.out.println(solve(s));
    }
}
