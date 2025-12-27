package STRIVERS.PATTERNS;

public class Patterns {
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {

            //printing the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            //printing the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {

            //printing the spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            //printing the star
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            //printing the spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {

            //printing the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            //printing the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            //printing the spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            //printing the star
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            //printing the spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {

            //printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //printing spaces
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            //printing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }

    public static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {


            //printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            //printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        char ch = 'E';
        for (int i = 1; i <= n; i++) {
            char cj = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(cj + " ");
                cj++;
            }
            System.out.println();
            ch--;
        }
    }

    public static void pattern19(int n) {
        //printing the first Half

        for (int i = 1; i <= n; i++) {

            //printing the stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            //printing the Space
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }
            //printing the stars
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Printing the second half
        for (int i = 1; i <= n; i++) {
            //Printing the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //printing the spaces
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            //printing the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 1; i <= 2 * n -1; i++) {
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*n-2*i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*i-2*n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
//        pattern17(5);
//        pattern18(5);
//        pattern19(5);
//        pattern20(5);
        pattern21(5);
    }
}
