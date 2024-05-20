package oop.polymorphism;

public class PolymorphismExample01 {

    public static void main(String[] args) {
        PolymorphismExample01 polymorphismExample01 = new PolymorphismExample01();

      // polymorphismExample01.sum(1,2);
       //polymorphismExample01.sum(1,2,3);
       // polymorphismExample01.sum(1.0, 3);
        polymorphismExample01.sum(1, 3.5);
    }

    public int sum(int number1, int number2) { // 1
        System.out.println("1");
        return number1 + number2;
    }

    public int sum(int number1, int number2, int number3) { // 2
        System.out.println("2");
        return number1 + number2 + number3;
    }

    public double sum(double number1, double number2) { // 3
        System.out.println("3");
        return number1 + number2;
    }

    public double sum(int number1, double number2) { // 4
        System.out.println("4");
        return number1 + number2;
    }
}
