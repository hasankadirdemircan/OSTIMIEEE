package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample01 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("bufferedWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("hello");
            bufferedWriter.newLine();
            bufferedWriter.write("world!");

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
