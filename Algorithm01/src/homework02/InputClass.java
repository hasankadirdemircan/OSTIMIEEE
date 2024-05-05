package homework02;

public class InputClass {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;

        SumClass sumClass = new SumClass();
        int totalSum = sumClass.sumBetweenStartAndEnd(start, end);
        System.out.println("total sum : " + totalSum);
    }
}
