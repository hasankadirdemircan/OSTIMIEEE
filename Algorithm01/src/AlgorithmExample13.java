import java.util.Random;

public class AlgorithmExample13 {
    //TODO: zar attğınızda 6-5 gelene kadar Random olarak zar atılsın, 6-5 geldiğinde ise; ekrana şunu yazsın;
    // 10. deneme de 6-5 geldi. bu algoritmaya uygun bir döngü seçiniz(do-while, while, for, foreach)
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<15; i++)
        {
            int number1 = random.nextInt(6) + 1;
            System.out.println(number1);
        }

    }
}
