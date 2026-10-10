package basics;
import java.util.Scanner;

class Account {
    double getRateOfInterest() {
        return 0;
    }
}

class RBI extends Account {
    double getRateOfInterest() {
        return 4;
    }
}

class SBI extends RBI {
    double getRateOfInterest() {
        return 7;
    }
}

class ICICI extends RBI {
    double getRateOfInterest() {
        return 6;
    }
}

class PNB extends RBI {
    double getRateOfInterest() {
        return 5;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest: ");
        String bank = sc.nextLine();

        Account account;

        if (bank.equalsIgnoreCase("RBI")) {
            account = new RBI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            account = new SBI();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            account = new ICICI();
        } else if (bank.equalsIgnoreCase("PNB")) {
            account = new PNB();
        } else {
            System.out.println("Invalid Bank");
            return;
        }

        System.out.println("Rate of interest is : "
                + account.getRateOfInterest() + "%");
    }
}

