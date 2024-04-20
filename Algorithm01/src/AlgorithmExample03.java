import java.util.Random;
import java.util.Scanner;

public class AlgorithmExample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        do {
            System.out.println("birinci sayıyı giriniz : ");
            number1 = scanner.nextInt();
            System.out.println("Girdiğiniz sayı : " + number1 + " dir.");
            System.out.println("ikinci sayıyı giriniz : ");
            number2 = scanner.nextInt();
        }while(number1 == 0 || number2 == 0);

        int sum = number1 + number2;
        System.out.println("girilen sayıların toplamı : " + sum + " dır");

    }
}
