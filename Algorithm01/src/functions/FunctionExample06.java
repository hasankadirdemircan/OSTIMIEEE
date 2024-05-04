package functions;

public class FunctionExample06 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int result = sum(number1, number2);
        System.out.println(result);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}
