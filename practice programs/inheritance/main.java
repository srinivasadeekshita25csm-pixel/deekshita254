package inheritance;

//Parent class
class Employee {
 int salary = 50000;
}

//Child class
class Programmer extends Employee {
 int bonus = 10000;

 void displayTotal() {
     // "super.salary" refers to the salary variable in Employee
     int totalPay = super.salary + this.bonus;
     System.out.println("Total Pay: $" + totalPay);
 }
}

public class Main {
 public static void main(String[] args) {
     Programmer p = new Programmer();
     p.displayTotal();
 }
}
