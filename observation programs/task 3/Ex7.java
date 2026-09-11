package exceptionex;

import java.io.*;
public class Ex8 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            System.out.println("IO error!");
        }
    }
}
