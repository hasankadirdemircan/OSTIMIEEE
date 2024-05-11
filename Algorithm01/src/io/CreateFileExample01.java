package io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample01 {
    public static void main(String[] args) throws IOException {
        File file = new File("newfile.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());

        file.deleteOnExit();
       // file.createNewFile();

    }
}
