package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample01 {

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("bufferedWriter.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String data;
            while((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
