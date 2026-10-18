package basics;

//Invalid:A class cannot implement another class
//implements is used only with interfaces
// C1 cannot implement C2
interface I3 {
    void display1();
}

class C3 implements I3 {
    public void display1() {
        System.out.println("C3 implements I3");
    }
}

class C4 extends C3 {
    void display3() {
        System.out.println("C4 extends C3");
    }
}

public class Case5 {
    public static void main(String[] args) {
        C4 obj = new C4();

        obj.display1();
        obj.display3();
    }
}



