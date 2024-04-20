public class AlgorithmExample02 {

    public static void main(String[] args) {
        int number1 = 2;
        if(number1 == 0) {
            System.out.println("0 girdiniz uygulama kapatılıyor.");
            System.exit(-1);
        }

        int number2 = 3;
        if(number2 == 0) {
            System.exit(-1);
        }

        int sum = number1 + number2;
        System.out.println("sum : " + sum);
    }
}
