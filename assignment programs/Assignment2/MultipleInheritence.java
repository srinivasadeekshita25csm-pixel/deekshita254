package basics;

//class C2 {
//}

//class C3 {
//}

// ERROR: Java does not support multiple inheritance using classes
// class C1 extends C2, C3 {
// }
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("Class C inherits A");
    }

    public void showB() {
        System.out.println("Class C inherits B");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {

        C obj = new C();

        obj.showA();
        obj.showB();
    }
}

