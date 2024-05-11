package io.homework01;

import java.io.FileWriter;

public class Homework01Writer {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("number.txt")) {
            for(int i=1; i<=10; i++) {
                fileWriter.write(String.valueOf(i));
                fileWriter.write("\n");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
