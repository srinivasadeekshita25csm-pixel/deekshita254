package basics;
class AccessExample
{
    // Public variable
    public int publicVar = 10;

    // Protected variable
    protected int protectedVar = 20;

    // Default variable
    int defaultVar = 30;

    // Private variable
    private int privateVar = 40;

    // Method to access private variable
    void displayPrivate()
    {
        System.out.println("Private variable: " + privateVar);
    }
}

public class AccessModifiersDemo
{
    public static void main(String args[])
    {
        AccessExample obj = new AccessExample();

        // Accessing public variable
        System.out.println("Public variable: " + obj.publicVar);

        // Accessing protected variable
        System.out.println("Protected variable: " + obj.protectedVar);

        // Accessing default variable
        System.out.println("Default variable: " + obj.defaultVar);

        // Accessing private variable through method
        obj.displayPrivate();

        // Direct access to private variable is not allowed
        // System.out.println(obj.privateVar);
    }
}

