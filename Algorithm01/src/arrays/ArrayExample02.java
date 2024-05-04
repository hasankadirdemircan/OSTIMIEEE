package arrays;

/*
2, -9, 0, 5, 12, -25, 22, 9, 8, 12 sayılarını bir dizi içerisine tanımlayınız. Daha sonra for/foreach kullanarak toplamını bulup ekrana yazdıran ve
sonrasında ise ortalamasını da hesaplayan ekrana yazdıran java kodunu yazınız.

 */
public class ArrayExample02 {

    public static void main(String[] args) {
        int numbers[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        //double sum = 0;
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];  //0 + 2   , -7, -7, -2
        }
        System.out.println("sum : " + sum);
        double average = (double) sum / numbers.length;
        System.out.println(average);
    }
}
