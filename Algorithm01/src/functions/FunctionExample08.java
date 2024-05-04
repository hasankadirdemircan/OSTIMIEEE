package functions;

public class FunctionExample08 {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        int result = sum(start, end);
        System.out.println("result : " + result);
    }

    public static int sum(int start, int end) {
        int toplam = 0;
        for(int i=start; i<=end; i++) {
            toplam = toplam + i;
            //0 + 5 + 6 + 7 + 8 + 9 + 10
        }

        return toplam;
    }
}
