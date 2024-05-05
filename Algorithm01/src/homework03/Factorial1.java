package homework03;

import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        Factorial2 findFactorial = new Factorial2();
        int factorail = findFactorial.findFactorial(number);
        System.out.println("The result is: " + factorail);
    }
}
