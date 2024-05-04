package functions;

public class FunctionExample07 {
    public static void main(String[] args) {
        int N = 5;
        int result = calculateFactorial(N);
        System.out.println("result = " + result);
    }

    public static int calculateFactorial(int N) {
        int factorial = 1;
        for(int i=1; i<=N; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
