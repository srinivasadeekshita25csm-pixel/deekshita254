package basics;
// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Multiple Inheritance using interfaces
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Father's property");
    }

    public void motherProperty() {
        System.out.println("Mother's property");
    }
}

// Hybrid Inheritance
class Person {
    void display() {
        System.out.println("Person");
    }
}

interface Student {
    void study();
}

class CollegeStudent extends Person implements Student {
    public void study() {
        System.out.println("Student studies");
    }
}

// Main class
public class InheritanceTypes {
    public static void main(String[] args) {

        // Single
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();

        // Hybrid
        CollegeStudent cs = new CollegeStudent();
        cs.display();
        cs.study();
    }
}



	


