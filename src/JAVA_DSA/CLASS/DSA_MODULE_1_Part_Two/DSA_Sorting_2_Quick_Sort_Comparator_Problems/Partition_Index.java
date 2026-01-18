package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;


import java.util.Arrays;

public class Partition_Index {
    //taking partition as the first element.
    public static int solve(int[]A){
        int n = A.length;
        int start = 0;
        int pivot = A[start];
        int low = start+1;
        int high = n-1;

        while (low<=high){
            if(A[low]<=pivot){
                low++;
            } else if (A[high] > pivot) {
                high--;
            }else{
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
        int temp = A[start];
        A[start] = A[high];
        A[high] = temp;
        System.out.println(low+" "+ high);
        System.out.println(Arrays.toString(A));
        return high;
    }


    public static void main(String[] args) {
        int[] A = {10, 13, 7, 8, 25, 20, 23, 5};
        int[] B = {6, 2, 0, 4, 5};
        System.out.println(solve(A));
    }
}
