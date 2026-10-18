package basics;
//I1 extends I2
interface I4 {
    void display2();
}

interface I5 extends I4 {
    void display1();
}

class Demo implements I4 {
    public void display1() {
        System.out.println("I4 method");
    }

    public void display2() {
        System.out.println("I5 method");
    }
}

public class Case6 {
    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.display1();
        obj.display2();
    }
}

