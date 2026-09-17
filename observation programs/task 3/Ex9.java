package csm254;

public class IllegalState {
	
	    public static void main(String[] args) {

	        try {
	            java.util.Scanner sc = new java.util.Scanner(System.in);

	            sc.close();

	            sc.nextLine();
	        }
	        catch (java.lang.IllegalStateException e) {
	            System.out.println("Scanner is already closed.");
	        }
	    }
	}
	   
