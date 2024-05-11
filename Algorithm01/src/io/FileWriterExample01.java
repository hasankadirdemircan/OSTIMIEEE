package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {

    public static void main(String[] args)  {

        //  Before java7
       /* FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/


        //FileWriter
        try(FileWriter fileWriter = new FileWriter("test.txt", false)) {
            fileWriter.write("hello");
            fileWriter.write("\n");
            fileWriter.write("my");
            fileWriter.write("\n");
            fileWriter.write("name");
            fileWriter.write("\n");
            fileWriter.write("is");
            fileWriter.write("\n");
            fileWriter.write("Kadir");
        }catch (Exception e) {
            System.out.println("dosya yazma işleminde bir hata ile karşılaşıldı : " + e);
        }
    }
}
