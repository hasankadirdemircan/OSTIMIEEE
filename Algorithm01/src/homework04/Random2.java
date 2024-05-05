package homework04;

import java.util.Random;

public class Random2 {
    public int randomCalculation(){
        Random random = new Random();
        int count=0;
        while(true){
            int sayi1=random.nextInt(6)+1;
            int sayi2=random.nextInt(6)+1;
            System.out.println(sayi1);
            System.out.println(sayi2);
            count++;
         if((sayi1==1 && sayi2==4)|| (sayi1==4 && sayi2==1)){
             return count;

         }
        }

    }
}
