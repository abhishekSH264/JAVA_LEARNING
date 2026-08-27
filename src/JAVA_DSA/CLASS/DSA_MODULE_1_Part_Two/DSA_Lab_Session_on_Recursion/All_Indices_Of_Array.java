package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class All_Indices_Of_Array {
    //iterative
    public static ArrayList<Integer> iterative(ArrayList<Integer> A, int B) {
        int n = A.size();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A.get(i) == B) {
                al.add(i);
            }
        }
        return al;
    }

    public static void addAll(ArrayList<Integer> A, int i, int B, ArrayList<Integer> al) {
        if (i == A.size()){
            return;
        }
        if(A.get(i)==B){
            al.add(i);
        }
        addAll(A,i+1,B,al);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        addAll(A,i,B,al);
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Collections.addAll(A, 1, 2, 3, 4, 5);
        int B = 1;
        System.out.println(iterative(A, B));
        System.out.println(solve(A,B));
    }
}
