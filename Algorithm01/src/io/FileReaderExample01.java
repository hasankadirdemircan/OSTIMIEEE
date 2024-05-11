package io;

import java.io.FileReader;

public class FileReaderExample01 {

    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("test.txt")) {
            int i;
            while((i=fileReader.read())!=-1) {
                System.out.print((char)i);
            }

        }catch (Exception e) {
            System.out.println("dosya okuma sırasında bir hata ile karşılaşıldı.");
        }
    }
}
