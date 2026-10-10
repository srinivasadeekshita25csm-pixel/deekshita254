package basics;

import java.io.*;

public class AllExceptionsDemo {

    public static void main(String[] args) {

        // 1. ArrayIndexOutOfBoundsException
        try {
            int[] a = {10, 20, 30};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1. ArrayIndexOutOfBoundsException");
        }


        // 2. StringIndexOutOfBoundsException
        try {
            String s = "Hello";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("2. StringIndexOutOfBoundsException");
        }


        // 3. NumberFormatException
        try {
            int n = Integer.parseInt("ABC");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("3. NumberFormatException");
        }


        // 4. ClassCastException
        try {
            Object obj = "Hello";
            Integer n = (Integer) obj;
            System.out.println(n);
        } catch (ClassCastException e) {
            System.out.println("4. ClassCastException");
        }


        // 5. IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("5. IllegalArgumentException");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }


        // 6. IllegalStateException
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            sc.close();
            sc.nextInt();
        } catch (IllegalStateException e) {
            System.out.println("6. IllegalStateException");
        }


        // 7. IOException
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("7. IOException");
        }


        // 8. FileNotFoundException
        try {
            FileInputStream f = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("8. FileNotFoundException");
        }


        // 9. InterruptedException
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("9. InterruptedException");
        }


        // 10. ArrayStoreException
        try {
            String[] names = new String[2];
            Object[] obj = names;
            obj[0] = 100;
        } catch (ArrayStoreException e) {
            System.out.println("10. ArrayStoreException");
        }
    }
}


