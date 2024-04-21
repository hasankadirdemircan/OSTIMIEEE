public class CastingExample01 {
    public static void main(String[] args) {
        int intNumber = 9;
        double doubleNumber = intNumber; // Automatic casting: int to double

        System.out.println(intNumber);      // Outputs 9
        System.out.println(doubleNumber);

        double doubleNumber2 = 9;
        int intNumber2 = (int) doubleNumber2;
        String sayHello = "hello";
        sayHello();

        int x = 5;
       // String multipy = 5*5 ;
        System.out.println(sayHello2());
    }

    public static void sayHello() {
        System.out.println("hello there!");
    }

    public static String sayHello2() {
        return "hello there!";
    }
}
