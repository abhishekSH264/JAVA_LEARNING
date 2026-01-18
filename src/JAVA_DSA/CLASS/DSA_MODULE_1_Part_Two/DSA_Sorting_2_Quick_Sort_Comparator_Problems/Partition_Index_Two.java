package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_2_Quick_Sort_Comparator_Problems;

public class Partition_Index_Two {
    public static int solve(int[] A) {
        //taking partition as last element
        int n = A.length;
        int start = n - 1;
        int pivot = A[start];
        int low = 0;
        int high = start - 1;
        while (low <= high) {
            if (A[low] <= pivot) {
                low++;
            } else if (A[high]>pivot){
                high--;
            }else{
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
            }
        }
        int temp = A[start];
        A[start] = A[low];
        A[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] A = {6, 2, 0, 4, 5};
        System.out.println(solve(A));
    }
}
