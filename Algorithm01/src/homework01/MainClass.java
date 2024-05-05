package homework01;

public class MainClass {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 3;

        MathClass mathClass = new MathClass();
        int maxValue = mathClass.findMaxNumber(number1, number2);

        System.out.println("Girilen değerlerden büyük olanı : " + maxValue);
    }
}
