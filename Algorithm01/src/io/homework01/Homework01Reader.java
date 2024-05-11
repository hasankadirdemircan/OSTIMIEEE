package io.homework01;

import java.io.FileReader;

public class Homework01Reader {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("number.txt")) {
            int i;
            int sum = 0;
            int previous = 0;
            while((i=fileReader.read())!=-1) {
                char let = (char)i;
                //System.out.print((let));
                int number = let - '0';
                if(number != -38) {
                    sum = sum + number;
                }

                // bir önceki eğer -38 değil ise, 2 sayıyı yan yana yaızp topla 10
              //  System.out.println(y);
            }

            System.out.println("sum : " + sum);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
