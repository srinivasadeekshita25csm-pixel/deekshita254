package basics;

interface I1 {
    void display1();
}

interface I2 {
    void display2();
}

// Stud class implements both interfaces
class Stud implements I1, I2 {

    public void display1() {
        System.out.println("Stud implements I1");
    }

    public void display2() {
        System.out.println("Stud implements I2");
    }
}

public class Case4Exam {

    public static void main(String[] args) {

        Stud obj = new Stud();

        obj.display1();
        obj.display2();
    }
}