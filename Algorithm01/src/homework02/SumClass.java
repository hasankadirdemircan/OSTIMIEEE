package homework02;

public class SumClass {

    public int sumBetweenStartAndEnd(int start, int end) {
        int sum = 0;
        for(int i=start; i<=end; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
