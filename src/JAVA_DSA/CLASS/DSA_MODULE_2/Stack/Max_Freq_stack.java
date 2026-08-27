package CLASS.DSA_MODULE_2.Stack;

import java.util.HashMap;
import java.util.*;

public class Max_Freq_stack {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Stack<Integer>> group = new HashMap<>();
        int maxFreq = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (ArrayList<Integer> op : A) {
            int type = op.get(0);
            int val = op.get(1);
            // PUSH
            if (type == 1) {
                int f = freq.getOrDefault(val, 0) + 1;
                freq.put(val, f);
                maxFreq = Math.max(maxFreq, f);
                group.putIfAbsent(f, new Stack<>());
                group.get(f).push(val);
                result.add(-1);
            }
            // POP
            else {
                int top = group.get(maxFreq).pop();
                freq.put(top, freq.get(top) - 1);
                if (group.get(maxFreq).isEmpty()) {
                    maxFreq--;
                }
                result.add(top);
            }
        }
        return result;
    }
    static void main() {

    }
}
