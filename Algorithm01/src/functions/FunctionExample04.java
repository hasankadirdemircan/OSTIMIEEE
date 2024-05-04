package functions;

import java.util.Scanner;

public class FunctionExample04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("faktoriyelini hesaplayacağımız sayıyı giriniz!");
        int N = scanner.nextInt();
        calculateFactorial(N);
        calculateFactorial2(N);
    }

    public static void calculateFactorial(int N) {
       // 5!  = 5 * 4 * 3 * 2 * 1;
        int factorial = 1;
        for (int i=1; i<=N; i++) {
            factorial = factorial * i;
         //   System.out.println(factorial);
        }
        System.out.println("Factorial1 = " + factorial);
    }
    public static void calculateFactorial2(int N) {
        // 5!  = 5 * 4 * 3 * 2 * 1;
        int factorial = 1;
        for (int i=N; i>=1; i--) {
            factorial = factorial * i;
          //  System.out.println(factorial);
        }
        System.out.println("Factorial2 = " + factorial);
    }
}
