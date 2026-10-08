package exceptionex;

public class Ex7{
    public static void main(String[] args) {
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index error!");
        }
    }
}
