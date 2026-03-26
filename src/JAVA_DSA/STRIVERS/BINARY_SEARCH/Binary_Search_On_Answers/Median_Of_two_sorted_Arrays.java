package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Median_Of_two_sorted_Arrays {
    public static double median(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                arr[k++] = A[i];
                i++;
            } else {
                arr[k++] = B[j];
                j++;
            }
        }
        while (i < n) {
            arr[k++] = A[i++];
        }
        while (j < m) {
            arr[k++] = B[j++];
        }
        int len = arr.length;
        if(len%2==0){
            return (arr[len / 2] + arr[len/2 - 1]) / 2.0;
        }else{
            return arr[len/2];
        }
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6};
        int[] B = {1, 3, 5};
        System.out.println(median(A,B));
    }
}
