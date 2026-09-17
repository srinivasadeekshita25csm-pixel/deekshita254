package csm254;

public class FileNotFound {

	    public static void main(String[] args) {

	        try {
	            java.io.File file = new java.io.File("abc.txt");
	            java.util.Scanner sc = new java.util.Scanner(file);

	            System.out.println("File opened successfully.");
	            sc.close();
	        }
	        catch (java.io.FileNotFoundException e) {
	            System.out.println("File not found.");
	        }
	    }
	}
