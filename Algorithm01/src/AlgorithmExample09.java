public class AlgorithmExample09 {

    public static void main(String[] args) {
        float exam1 = 100;
        float exam2 = 60;

        double avg = (exam1 * 0.4) + (exam2 * 0.6);

        System.out.println(avg);

        if(avg >= 60 && avg <= 70) {
            System.out.println("note : BB" );
        }else if (avg > 70 && avg <= 80) {
            System.out.println("note : BA");
        }else if(avg > 80 && avg <= 100) {
            System.out.println("note : AA");
        }
    }
}
