package exceptionex;

public class InterruptedExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error: Thread interrupted!");
        }
    }
}
