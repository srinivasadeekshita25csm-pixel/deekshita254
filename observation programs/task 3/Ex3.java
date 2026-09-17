package exceptions;

public class ClassNotFound {
	    public static void main(String[] args)
	    {
	        try
	        {
	            Class.forName("Student");
	            System.out.println("Class found");
	        }
	        catch (ClassNotFoundException e)
	        {
	            System.out.println("Class not found");
	        }
	    }
	}
