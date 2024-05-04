package functions;

import java.util.Scanner;

public class FunctionExample03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayısı girinz : ");
        int N = scanner.nextInt();
        loopMethod(N);
    }

    public static void loopMethod(int N) {
        for(int i=1; i<=N; i++) {
            System.out.println(i);
        }
    }
}
