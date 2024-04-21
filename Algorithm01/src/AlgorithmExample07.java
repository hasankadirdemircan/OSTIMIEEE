import java.util.Random;
import java.util.Scanner;

public class AlgorithmExample07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        int number1 = scanner.nextInt();
        if(number1 % 2 == 0) {
            System.out.println(number1 + " sayınız çifttir" );
        }else {
            System.out.println(number1 + "sayınız tektir.");
        }
    }
}
