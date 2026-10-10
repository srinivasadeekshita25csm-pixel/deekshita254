package basics;
class Buyer {

    String name;
    int id;
    String product;
    double amount;
    String paymentStatus;

    // Constructor 1
    Buyer(String name) {
        this.name = name;
    }

    // Constructor 2
    Buyer(String name, int id, String product) {
        this.name = name;
        this.id = id;
        this.product = product;
    }

    // Constructor 3
    Buyer(String name, int id, String product,
          double amount, String paymentStatus) {
        this.name = name;
        this.id = id;
        this.product = product;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Product: " + product);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println();
    }
}

public class BuyerDemo {
    public static void main(String[] args) {

        Buyer b1 = new Buyer("Manu");

        Buyer b2 = new Buyer(
            "Ravi", 101, "Laptop"
        );

        Buyer b3 = new Buyer(
            "Priya", 102, "Mobile", 50000, "Paid"
        );

        b1.display();
        b2.display();
        b3.display();
    }
}

