import java.util.Scanner;

public class AlgorithmExample16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        while(true) {
            System.out.println("sayı giriniz : ");
            number = scanner.nextInt();
            if(number == 0) {
                break;
            }
            sum = sum + number;
            System.out.println("şuan toplam : " + sum);
        }

        System.out.println("0'a kadar girdiğiniz sayıların toplamı : " + sum);
    }
}
