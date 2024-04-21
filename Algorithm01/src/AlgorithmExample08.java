public class AlgorithmExample08 {
    public static void main(String[] args) {
        int number1 = 87, number2 = 13, number3 = 87;
        boolean condition = true;
        // Ön Arttırma ve Azalatma Operatörü:
        System.out.println("(A) Değeri: "+ number1 + "\t(++A) Değeri: "+ (++number1));
        System.out.println("(A) Değeri: "+ number3 + "\t(++A) Değeri: "+ (number3++));
        System.out.println("(B) Değeri: "+ number2 +"\t(--B) Değeri: "+(--number2));
        // Sonrası Artış ve Azaltma Operatörü
        System.out.println("(A) Değeri: "+ number1 +"\t(A--) Değeri: "+(--number1));
        System.out.println("(B) Değeri: "+ number2 + "\t(B++) Değeri: "+ (++number2));
        // Mantıksal Değil Operatörü:
        System.out.println("Değil (!): "+!condition);

    }
}
