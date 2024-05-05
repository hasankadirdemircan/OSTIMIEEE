package try_catch;

public class TryCatchExample01 {
    public static void main(String[] args) {
        int number = 5;

        try{
            int result = number/0;
        }catch (Exception e) {
            System.out.println("hata alındı");
            System.out.println(e);
        }

        System.out.println("uygulama devam ediyor");
    }
}
