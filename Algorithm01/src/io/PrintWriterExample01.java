package io;

import java.io.PrintWriter;

public class PrintWriterExample01 {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter("prinwriter.txt")) {
            printWriter.println("hello");
            printWriter.println("world");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
