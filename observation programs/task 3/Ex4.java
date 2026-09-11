package exceptionex;

public class Ex5 {
    public static void main(String[] args) {
        try {
            Object o = "Hi";
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            System.out.println("Class cast error!");
        }
    }
}
