package basics;
class Customer {
    String name;
    String location;

    void sendOrder() {
        System.out.println(name + " sent the order");
    }

    void receiveOrder() {
        System.out.println(name + " received the order");
    }
}

class Order {
    String date;
    String number;

    void confirm() {
        System.out.println("Order confirmed");
    }

    void close() {
        System.out.println("Order closed");
    }
}

class SpecialOrder extends Order {

    void dispatch() {
        System.out.println("Special order dispatched");
    }
}

class NormalOrder extends Order {

    void dispatch() {
        System.out.println("Normal order dispatched");
    }

    void receive() {
        System.out.println("Normal order received");
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.name = "Manu";
        c.location = "Vizag";

        SpecialOrder so = new SpecialOrder();
        so.date = "10-09-2026";
        so.number = "S101";

        NormalOrder no = new NormalOrder();
        no.date = "10-09-2026";
        no.number = "N101";

        c.sendOrder();

        so.confirm();
        so.dispatch();
        so.close();

        no.confirm();
        no.dispatch();
        no.receive();
        no.close();

        c.receiveOrder();
    }
}

