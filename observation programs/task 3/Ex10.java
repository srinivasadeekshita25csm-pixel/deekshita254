package exceptions;

public class IllegalArgument {

	    static void checkAge(int age) {

	        if (age < 0) {
	            throw new IllegalArgumentException("Age cannot be negative");
	        }

	        System.out.println("Age is valid");
	    }

	    public static void main(String[] args) {

	        try {
	            checkAge(-5);
	        }
	        catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException occurred");
	            System.out.println(e.getMessage());
	        }
	    }
	
