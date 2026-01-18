package CLASS.DSA_MODULE_1_Part_Two.DSA_Sorting_1_Count_Sort_Merge_Sort;

public class Max_Chunks_To_Make_Sorted {
    public static int solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum+=i;
            if(sum==prefix[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 0};
        System.out.println(solve(A));
    }
}
