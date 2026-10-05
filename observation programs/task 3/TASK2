package banking;

// Base class
class Account {

    // Attributes
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdrawal method
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Transfer method
    void transfer(Account receiver, double amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println(
                    "Transferred: Rs." + amount +
                    " to " + receiver.accountHolderName);

        } else {
            System.out.println(
                    "Insufficient balance for transfer");
        }
    }

    // Display account details
    void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}


// Savings Account
class SavingsAccount extends Account {

    // Additional attribute
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber,
                   String accountHolderName,
                   double balance,
                   double interestRate) {

        super(accountNumber, accountHolderName,
              balance, "Savings");

        this.interestRate = interestRate;
    }

    // Interest calculation
    void calculateInterest() {

        double interest =
                balance * interestRate / 100;

        System.out.println(
                "Interest Rate   : " + interestRate + "%");

        System.out.println(
                "Interest Amount : Rs." + interest);

        balance = balance + interest;
    }
}


// Current Account
class CurrentAccount extends Account {

    // Additional attribute
    double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber,
                   String accountHolderName,
                   double balance,
                   double overdraftLimit) {

        super(accountNumber, accountHolderName,
              balance, "Current");

        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {

        if (amount > 0 &&
            amount <= balance + overdraftLimit) {

            balance = balance - amount;

            System.out.println(
                    "Withdrawn: Rs." + amount);

            if (balance < 0) {
                System.out.println(
                        "Overdraft used: Rs." + (-balance));
            }

        } else {

            System.out.println(
                    "Withdrawal exceeds overdraft limit");
        }
    }
}


// Main class
public class BankingSystem {

    public static void main(String[] args) {

        // Object creation
        SavingsAccount savings =
                new SavingsAccount(
                        101,
                        "Deekshita",
                        10000,
                        5
                );

        CurrentAccount current =
                new CurrentAccount(
                        102,
                        "Rahul",
                        5000,
                        2000
                );


        // Initial account details
        System.out.println(
                "===== INITIAL ACCOUNT DETAILS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();


        // Savings account operations
        System.out.println(
                "\n===== SAVINGS ACCOUNT OPERATIONS =====");

        savings.deposit(2000);

        savings.withdraw(1000);

        savings.calculateInterest();


        // Current account operations
        System.out.println(
                "\n===== CURRENT ACCOUNT OPERATIONS =====");

        current.deposit(1000);

        current.withdraw(7000);


        // Fund transfer
        System.out.println(
                "\n===== FUND TRANSFER =====");

        savings.transfer(current, 2000);


        // Final account details
        System.out.println(
                "\n===== FINAL ACCOUNT DETAILS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();
    }
}
