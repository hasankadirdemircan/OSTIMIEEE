package io;

import java.io.File;
import java.io.IOException;

public class CreateFolderExample01 {
    public static void main(String[] args) {
        File folder = new File("myDir");
      //  boolean isCreated = folder.mkdir();
      //  System.out.println(isCreated);

        File file = new File(folder, "fileOfmyDir.txt");
        boolean isCreatedFile;
       /* try {
      //      isCreatedFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    //    System.out.println(isCreatedFile);

        file.deleteOnExit();
        folder.deleteOnExit();
    }
}
