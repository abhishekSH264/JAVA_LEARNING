package CLASS.DSA_MODULE_1_Part_Two.DSA_Bit_Manipulation;

/*
Problem Description
Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing 
questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.
Problem Constraints
0 <= A <= 10^9
Input Format
The only argument given is an integer A.
Output Format
Return the minimum number of times help taken from Sam.
Example Input
Input 1:
A = 5
Input 2:
A = 3
 */
public class Help_From_Sam {
    public static int solve(int A) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((A & (1 << i)) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solve(n));
    }
}
