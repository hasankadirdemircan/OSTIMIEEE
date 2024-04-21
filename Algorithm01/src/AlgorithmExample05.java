import java.util.Scanner;

public class AlgorithmExample05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        int number1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz : ");
        int number2 = scanner.nextInt();

        float average = ((float)number1 + (float)number2) / 2;
        System.out.println("average : " + average);
    }
}
