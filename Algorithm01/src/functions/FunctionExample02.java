package functions;

public class FunctionExample02 {
    public static void main(String[] args) {
       int number1 = 10;
       int number2 = 20;

        sum(number1, number2);
        subtract(45, 2);
        multipy(number1, number2);
        System.out.println("hello");

    }

    public static void sum(int number1, int number2) {
        int toplam = number1 + number2;
        System.out.println("sum : " + toplam);
    }

    public static void subtract(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("result subtract : " + result);
    }

    public static void multipy(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("result multipy : " + result);
    }
}
