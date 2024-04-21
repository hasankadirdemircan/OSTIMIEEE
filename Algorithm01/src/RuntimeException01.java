public class RuntimeException01 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        if(b != 0) {
            System.out.println("Result: "+ a/b);
        }else {
            System.out.println("Sıfıra bölünemez!");
        }
    }
}
