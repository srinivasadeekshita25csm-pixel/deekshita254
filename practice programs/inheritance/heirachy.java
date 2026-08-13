package inheritance;

// Parent Class
class Employe {
 double salary = 50000;
 
 public void showSalary() {
    salary += 5000;
     System.out.println("Salary: $" + salary);
 }
}

//Subclass 1
class Developer extends Employe {
 double bonus = 10000;
}

//Subclass 2
class Designer extends Employe {
 double bonus = 5000;
}

public class Heirachy {
 public static void main(String[] args) {
     Developer dev = new Developer();
     Designer des = new Designer();
     
 
     dev.showSalary(); 
     des.showSalary(); 
 }
}
// expected output:
// Salary: $55000.0
// Salary: $55000.0
