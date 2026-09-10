package javaassignment;

import java.util.Scanner;

public class StringClassOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
        String str2 = "Java Programming";

        while (true) {
            System.out.println("\n--- String Class Operations ---");
            System.out.println("1. length()");
            System.out.println("2. charAt()");
            System.out.println("3. substring()");
            System.out.println("4. contains()");
            System.out.println("5. equals()");
            System.out.println("6. equalsIgnoreCase()");
            System.out.println("7. compareTo()");
            System.out.println("8. startsWith()");
            System.out.println("9. endsWith()");
            System.out.println("10. indexOf()");
            System.out.println("11. lastIndexOf()");
            System.out.println("12. toUpperCase()");
            System.out.println("13. toLowerCase()");
            System.out.println("14. trim()");
            System.out.println("15. replace()");
            System.out.println("16. split()");
            System.out.println("17. join()");
            System.out.println("18. concat()");
            System.out.println("19. isEmpty()");
            System.out.println("20. valueOf()");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(str.length()); 
                    break;
                case 2: 
                    System.out.println(str.charAt(4));
                    break;
                case 3: 
                    System.out.println(str.substring(0,5));
                    break;
                case 4:
                    System.out.println(str.contains("World"));
                    break;
                case 5:
                    System.out.println(str.equals(str2));
                    break;
                case 6:
                    System.out.println(str.equalsIgnoreCase("hello world"));
                    break;
                case 7:
                    System.out.println(str.compareTo(str2));
                    break;
                case 8:
                    System.out.println(str.startsWith("Hello"));
                    break;
                case 9:
                    System.out.println(str.endsWith("World"));
                    break;
                case 10:
                    System.out.println(str.indexOf('o'));
                    break;
                case 11:
                    System.out.println(str.lastIndexOf('o'));
                    break;
                case 12:
                    System.out.println(str.toUpperCase());
                    break;
                case 13:
                    System.out.println(str.toLowerCase());
                    break;
                case 14:
                    System.out.println("   Java   ".trim());
                    break;
                case 15:
                    System.out.println(str.replace("World","Java"));
                    break;
                case 16:
                    for(String s: str2.split(" "))
                    System.out.println(s); 
                    break;
                case 17:
                    System.out.println(String.join("-", "Java","is","fun"));
                    break;
                case 18:
                    System.out.println(str.concat(" " + str2));
                    break;
                case 19:
                    System.out.println("".isEmpty());
                    break;
                case 20:
                    System.out.println(String.valueOf(123));
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
