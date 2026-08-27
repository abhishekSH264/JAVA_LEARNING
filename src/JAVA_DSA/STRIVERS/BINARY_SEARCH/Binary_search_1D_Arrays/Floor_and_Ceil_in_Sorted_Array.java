package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

import java.util.Arrays;

public class Floor_and_Ceil_in_Sorted_Array {
    public static void bruteforce(int[]A,int x){
        int n = A.length;
        int floor = -1;
        int ceil = -1;
        for(int i = 0; i < n; i ++){
            if(floor!=-1&& ceil !=-1){
                break;
            }
            if(A[i] <= x){
                floor = A[i];
            }
            if(A[i] >=x){
                ceil = A[i];
            }

        }
        System.out.println("floor of "+x+" is : "+floor);
        System.out.println("Ceil of "+x+" is : "+ceil);
    }
    public static int solveFloor(int[]A,int x){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid] <= x){
                ans = A[mid];
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int solveCeil(int[]A,int x){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(A[mid] >=x){
                ans = A[mid];
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 7, 8, 10};
        int K = 5;
//        bruteforce(A,K);
//        System.out.println(floorBrute(A,K));
        System.out.println(solveFloor(A,K));
//        System.out.println(ceilBrute(A,K));
        System.out.println(solveCeil(A,K));
    }
}
