package exceptionex;

import java.io.*;
public class Ex7 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nofile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
