package basics;
import java.util.Scanner;


class Account {
 int accNo;
 double balance;
 String type;


 Account(int no, double bal, String t) {
     accNo = no;
     balance = bal;
     type = t;
 }

 
 void deposit(double amt) {
     balance += amt;
     System.out.println("Deposited: " + amt);
     System.out.println("Balance: " + balance);
 }

 
 void withdraw(double amt) {
     if (amt <= balance) {
         balance -= amt;
         System.out.println("Withdrawn: " + amt);
         System.out.println("Balance: " + balance);
     } else {
         System.out.println("Not enough balance!");
     }
 }

 
 void transfer(Account other, double amt) {
     if (amt <= balance) {
         balance -= amt;
         other.balance += amt;
         System.out.println("Transfer done!");
     } else {
         System.out.println("Transfer failed!");
     }
 }

 
 void show() {
     System.out.println("Acc No : " + accNo);
     System.out.println("Type   : " + type);
     System.out.println("Bal    : " + balance);
 }
}


//Savings account class
class SavingsAccount extends Account {

 double rate;

 SavingsAccount(int no, double bal, double r) {
     super(no, bal, "Savings");
     rate = r;
 }

 
 void calcInterest() {
     double interest = balance * rate / 100;
     System.out.println("Interest: " + interest);
 }
}



class CurrentAccount extends Account {

 double limit;

 CurrentAccount(int no, double bal, double l) {
     super(no, bal, "Current");
     limit = l;
 }

 
 @Override
 void withdraw(double amt) {
     if (amt <= balance + limit) {
         balance -= amt;
         System.out.println("Withdraw ok. Balance: " + balance);
     } else {
         System.out.println("Overdraft limit crossed!");
     }
 }
}



public class BankSystem {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     
     SavingsAccount sAcc =
             new SavingsAccount(101, 5000, 5);

     CurrentAccount cAcc =
             new CurrentAccount(201, 3000, 2000);

     int ch;

     do {
         System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
         System.out.println("1. Show Savings Account");
         System.out.println("2. Deposit in Savings");
         System.out.println("3. Withdraw from Savings");
         System.out.println("4. Calculate Interest");
         System.out.println("5. Show Current Account");
         System.out.println("6. Deposit in Current");
         System.out.println("7. Withdraw from Current");
         System.out.println("8. Transfer Money");
         System.out.println("9. Exit");

         System.out.print("Enter choice: ");
         ch = sc.nextInt();

         switch (ch) {

             case 1:
                 sAcc.show();
                 break;

             case 2:
                 System.out.print("Enter amount: ");
                 double d1 = sc.nextDouble();
                 sAcc.deposit(d1);
                 break;

             case 3:
                 System.out.print("Enter amount: ");
                 double w1 = sc.nextDouble();
                 sAcc.withdraw(w1);
                 break;

             case 4:
                 sAcc.calcInterest();
                 break;

             case 5:
                 cAcc.show();
                 break;

             case 6:
                 System.out.print("Enter amount: ");
                 double d2 = sc.nextDouble();
                 cAcc.deposit(d2);
                 break;

             case 7:
                 System.out.print("Enter amount: ");
                 double w2 = sc.nextDouble();
                 cAcc.withdraw(w2);
                 break;

             case 8:
                 System.out.print("Enter amount to transfer: ");
                 double t = sc.nextDouble();
                 sAcc.transfer(cAcc, t);
                 break;

             case 9:
                 System.out.println("Thank you!");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     } while (ch != 9);

     sc.close();
 
}



}

