package basics;
class C2 {
    void displayC2() {
        System.out.println("This is C2");
    }
}

class C1 extends C2 {
    void displayC1() {
        System.out.println("This is C1");
    }
}

public class Main1 {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.displayC2();
        obj.displayC1();
    }
}



