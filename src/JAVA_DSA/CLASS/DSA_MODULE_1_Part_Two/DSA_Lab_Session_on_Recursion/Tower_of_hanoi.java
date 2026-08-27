package CLASS.DSA_MODULE_1_Part_Two.DSA_Lab_Session_on_Recursion;

public class Tower_of_hanoi {
    public static void hanoi(int n, char source, char target, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        hanoi(n - 1, source, aux, target);

        System.out.println("Move disk " + n + " from " + source + " to " + target);

        hanoi(n - 1, aux, target, source);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
}
