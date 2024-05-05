package homework03;

public class Factorial2 {
    public int findFactorial(int number) {
        int faktoriyel=1;

        for (int i = 1 ; i <= number; i++){
           faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }
}
