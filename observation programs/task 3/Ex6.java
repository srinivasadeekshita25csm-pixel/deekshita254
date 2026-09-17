package exceptions;

public class NegativeArray {

	    public static void main(String[] args) {

	        try {
	            int size = -5;

	            int arr[] = new int[size];

	            System.out.println("Array created successfully");
	        }
	        catch (NegativeArraySizeException e) {
	            System.out.println("Exception: Array size cannot be negative");
	        }
	    }
	}
