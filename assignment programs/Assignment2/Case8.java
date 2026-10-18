package basics;
interface I8 {
    void display2();
}

interface I9 {
    void display3();
}

interface I7 extends I8, I9 {
    void display1();
}

class Example implements I7 {
    public void display1() {
        System.out.println("I7 method");
    }

    public void display2() {
        System.out.println("I8 method");
    }

    public void display3() {
        System.out.println("I9 method");
    }
}

public class Case8 {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.display1();
        obj.display2();
        obj.display3();
    }
}

