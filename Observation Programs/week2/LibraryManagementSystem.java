package basics;


	class Book {
	    private int bookId;
	    private String bookName;
	    private String author;
	    private double price;

	    // Default Constructor
	    Book() {
	        bookId = 0;
	        bookName = "Unknown";
	        author = "Unknown";
	        price = 0;
	    }

	    // Parameterized Constructor
	    Book(int bookId, String bookName, String author, double price) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.author = author;
	        this.price = price;
	    }

	    // Getters
	    public int getBookId() {
	        return bookId;
	    }

	    public String getBookName() {
	        return bookName;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    // Setters
	    public void setBookId(int bookId) {
	        this.bookId = bookId;
	    }

	    public void setBookName(String bookName) {
	        this.bookName = bookName;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void displayBook() {
	        System.out.println("Book ID : " + bookId);
	        System.out.println("Book Name : " + bookName);
	        System.out.println("Author : " + author);
	        System.out.println("Price : " + price);
	    }
	}

	// Inheritance
	class Person {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Student extends Person {
	    int rollNo;

	    Student(String name, int age, int rollNo) {
	        super(name, age);
	        this.rollNo = rollNo;
	    }

	    void display() {
	        System.out.println("Student Name : " + name);
	        System.out.println("Age : " + age);
	        System.out.println("Roll No : " + rollNo);
	    }
	}

	class Faculty extends Person {
	    String subject;

	    Faculty(String name, int age, String subject) {
	        super(name, age);
	        this.subject = subject;
	    }

	    void display() {
	        System.out.println("Faculty Name : " + name);
	        System.out.println("Age : " + age);
	        System.out.println("Subject : " + subject);
	    }
	}

	// Polymorphism - Method Overloading
	class Area {

	    void area(int side) {
	        System.out.println("Area of Square = " + (side * side));
	    }

	    void area(int length, int breadth) {
	        System.out.println("Area of Rectangle = " + (length * breadth));
	    }

	    void area(double radius) {
	        System.out.println("Area of Circle = " + (3.14 * radius * radius));
	    }
	}

	// Polymorphism - Method Overriding
	class Vehicle {
	    void display() {
	        System.out.println("This is a Vehicle");
	    }
	}

	class Car extends Vehicle {
	    void display() {
	        System.out.println("This is a Car");
	    }
	}

	class Bike extends Vehicle {
	    void display() {
	        System.out.println("This is a Bike");
	    }
	}

	// Abstraction
	abstract class Shape {
	    abstract void draw();
	}

	class Circle extends Shape {
	    void draw() {
	        System.out.println("Drawing Circle");
	    }
	}

	class Rectangle extends Shape {
	    void draw() {
	        System.out.println("Drawing Rectangle");
	    }
	}

	// Interface
	interface Printable {
	    void print();
	}

	class Report implements Printable {
	    public void print() {
	        System.out.println("Printing Report");
	    }
	}

	public class LibraryManagementSystem {

	    public static void main(String[] args) {

	        System.out.println("===== PART A & B =====");

	        Book b1 = new Book();
	        Book b2 = new Book(101, "Java Programming", "James Gosling", 550);

	        b1.setBookId(100);
	        b1.setBookName("Python");
	        b1.setAuthor("Guido");
	        b1.setPrice(450);

	        b1.displayBook();

	        System.out.println();

	        b2.displayBook();

	        System.out.println("\n===== PART C =====");

	        Student s = new Student("Manasa", 19, 25);
	        s.display();

	        System.out.println();

	        Faculty f = new Faculty("Ramesh", 40, "Java");
	        f.display();

	        System.out.println("\n===== PART D =====");

	        Area obj = new Area();
	        obj.area(5);
	        obj.area(10, 5);
	        obj.area(7.0);

	        Vehicle v;

	        v = new Car();
	        v.display();

	        v = new Bike();
	        v.display();

	        System.out.println("\n===== PART E =====");

	        Shape c = new Circle();
	        c.draw();

	        Shape r = new Rectangle();
	        r.draw();

	        Report rep = new Report();
	        rep.print();
	    }
	}
	
	    

	    