package basics;
interface TestInterface {
    void display();
}

class TestClass implements TestInterface {

    public void display() {
        System.out.println("TestClass implements TestInterface");
    }
}

public class Case3Example {

    public static void main(String[] args) {

        TestClass obj = new TestClass();

        obj.display();
    }
}
