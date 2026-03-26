package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.Arrays;

public class N_3_Repeat_numbers {
    public static int[] solve(int[]A){
        int n = A.length;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            if(count1==0&&A[i]!=ele2){
                ele1 = A[i];
                count1 = 1;
            } else if (count2==0&&A[i]!=ele1) {
                ele2 = A[i];
                count2 = 1;
            }else if(A[i]==ele1){
                count1++;
            }else if(A[i]==ele2){
                count2++;
            }else{
                count1--;count2--;
            }
        }
        count1 = 0;count2 = 0;
        for(int i :A){
            if(i == ele1){
                count1++;
            }
            if(i==ele2){
                count2++;
            }
        }
        int[]arr = new int[2];
        int k = 0;
        if(count1 > n /3){
                arr[k++] = ele1;
        }
        if (count2 > n /3) {
            arr[k++] = ele2;
        }
        return arr;
    }
    public static void main(String[] args){
        int[]A = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(Arrays.toString(solve(A)));
    }
}
