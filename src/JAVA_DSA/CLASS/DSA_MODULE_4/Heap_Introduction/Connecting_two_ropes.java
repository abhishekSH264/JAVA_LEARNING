package CLASS.DSA_MODULE_4.Heap_Introduction;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Connecting_two_ropes {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int ans = 0;
        int sum = A[0];
        Arrays.sort(A);
        for (int i = 1; i < n; i++) {
            sum += A[i];
            ans += sum;
        }
        return ans;
    }

    public static int solve(int[] A) {
        int n = A.length;
        PriorityQueue<Integer> qu = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            qu.add(A[i]);
        }
        int ans = 0;
        while (qu.size() > 1) {
            int ele1 = qu.poll();
            int ele2 = qu.poll();
            int cost = ele1+ele2;
            ans+=cost;
            qu.add(cost);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
    }
}
