package exceptions;

public class ClassCast{
	public static void main(String[] args) {

        Object value = "Welcome to Paris";

        try {
            System.out.println("Value: " + value);

            Integer number = (Integer) value;

            System.out.println("Number: " + number);
        }
        catch (ClassCastException e) {
            System.out.println("Error: Cannot convert String into Integer.");
        }

        System.out.println("Program exit.");
    }
}
