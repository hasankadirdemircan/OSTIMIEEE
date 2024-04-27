package loops;

public class WhileLoopExample03 {
    public static void main(String[] args) {
        int startValue = 0;
        do {
            System.out.print(startValue + "\t");
            startValue++;
        } while (startValue != 0 && startValue <= 5);

    }
}
