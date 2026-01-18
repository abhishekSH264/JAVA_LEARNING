package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Hashing;
import java.util.*;
public class Distinct_Numbers_in_Window {
    public static ArrayList<Integer> solve(int[]A,int K){
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<K;i++){
            int val = A[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }
        al.add(map.size());
        int start = 1;
        int end = K;
        while (end<n){
            int out = A[start-1];
            map.put(out,map.getOrDefault(out,0)-1);
            if(map.get(out)==0){
                map.remove(out);
            }
            int in = A[end];
            map.put(in,map.getOrDefault(in,0)+1);
            al.add(map.size());
            start++;
            end++;
        }

        System.out.println(map);
        return al;
    }
    public static void main(String[] args){
        int[] A = {1, 2, 1, 3, 4, 3};
        int K = 3;
        System.out.println(solve(A,K));
    }
}
