package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

import java.util.Arrays;

public class Quick_Sort {
    public static int[] solve(int[] A) {
        int n = A.length;
        quicksort(A,0,n-1);
        return A;
    }
    public static void quicksort(int[]A,int low,int high){
        int n = A.length;
        if (low < high){
            int idx = pivot(A,low,high);
            quicksort(A,0, idx -1);
            quicksort(A,idx+1,high);
        }
    }
    public static int pivot(int[]A,int low,int high){
        int n = A.length;
        int start = low;
        int pivot = A[start];
        while (low<=high){
            if(A[low] <= pivot){
                low++;
            } else if (A[high] > pivot) {
                high--;
            }else {
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
            }
        }
        int temp = A[start];
        A[start] = A[high];
        A[high] = temp;
        return high;
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 10, 2, 1, 5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
