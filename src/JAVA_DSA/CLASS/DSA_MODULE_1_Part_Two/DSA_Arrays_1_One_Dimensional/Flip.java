package CLASS.DSA_MODULE_1_Part_Two.DSA_Arrays_1_One_Dimensional;

import java.util.Arrays;

public class Flip {
    public static int[] bruteforce(String A){
        int n = A.length();
        int maxsum = 0;
        int start = -1,end = -1;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int gain = 0;
                for(int k = i; k <= j; k++){
                    if(A.charAt(k)=='0'){
                        gain+=1;
                    }else{
                        gain-=1;
                    }
                }
                if(gain > maxsum){
                    maxsum = gain;
                    start = i;
                    end = j;
                }
            }
        }
        if(start ==-1){
            return new int[]{};
        }
        return new int[]{start+1,end+1};
    }
    public static int[] solve(String A) {
        int n = A.length();
        int sum = 0;
        int maxSum = 0;
        int tempStart = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch=='0'){
                sum+=1;
            }else{
                sum-=1;
            }
            if(sum > maxSum ){
                maxSum = sum;
                start = tempStart;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                tempStart = i+1;
            }
        }if(end == -1){
            return new int[]{};
        }
        return new int[]{start+1,end+1};
    }

    public static void main(String[] args) {
        String A = "010";
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
