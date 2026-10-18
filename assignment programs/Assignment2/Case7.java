package basics;
//Invalid:An interface cannot implement a class
//I1 cannot implement C1
// implements is used by classes with interfaces
// correct implementation
interface I6 {
    void display();
}

class C5 implements I6 {
    public void display() {
        System.out.println("C5 implements I6");
    }
}

public class Case7 {
    public static void main(String[] args) {
        C5 obj = new C5();

        obj.display();
    }
}
