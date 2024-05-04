package functions;

import java.util.Scanner;

public class FunctionExample05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int number = scanner.nextInt();
        findEvenOrOdd(number);
    }

    public static void findEvenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println("sayı çifttir /odd");
        }else {
            System.out.println("sayı tektir/even");
        }
    }
}
