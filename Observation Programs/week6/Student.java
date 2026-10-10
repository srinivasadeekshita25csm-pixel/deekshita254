package basics;

public class Student {int rollNumber;
String studentName;
int[] marks;

// Constructor
Student(int rollNumber, String studentName, int[] marks) {
    this.rollNumber = rollNumber;
    this.studentName = studentName;
    this.marks = marks;
}

// Calculate total marks
int calculateTotal() {
    int total = 0;

    for (int mark : marks) {
        total += mark;
    }

    return total;
}

// Calculate average
double calculateAverage() {
    return calculateTotal() / 5.0;
}

// Find highest mark
int findHighest() {
    int highest = marks[0];

    for (int mark : marks) {
        highest = Math.max(highest, mark);
    }

    return highest;
}

// Find lowest mark
int findLowest() {
    int lowest = marks[0];

    for (int mark : marks) {
        lowest = Math.min(lowest, mark);
    }

    return lowest;
}

// Calculate percentage
double calculatePercentage() {
    return (calculateTotal() / 500.0) * 100;
}

// Calculate grade
String calculateGrade() {
    double percentage = calculatePercentage();

    if (percentage >= 90)
        return "A+";
    else if (percentage >= 80)
        return "A";
    else if (percentage >= 70)
        return "B";
    else if (percentage >= 60)
        return "C";
    else if (percentage >= 50)
        return "D";
    else
        return "F";
}

// Display complete performance report
void displayDetails() {
    String formattedName = studentName.trim().toUpperCase();

    double percentage = calculatePercentage();

    // Round percentage to two decimal places
    double roundedPercentage = Math.round(percentage * 100.0) / 100.0;

    String grade = calculateGrade();

    System.out.println("----- Student Performance Report -----");
    System.out.println("Roll Number   : " + rollNumber);
    System.out.println("Student Name  : " + formattedName);
    System.out.println("Name Length   : " + formattedName.length());
    System.out.println("Total Marks   : " + calculateTotal() + "/500");
    System.out.println("Average Marks : " + calculateAverage());
    System.out.println("Highest Mark  : " + findHighest());
    System.out.println("Lowest Mark   : " + findLowest());
    System.out.println("Percentage    : " + roundedPercentage + "%");
    System.out.println("Grade         : " + grade);

    if (percentage >= 50)
        System.out.println("Result  : PASS");
    else
        System.out.println("Result   : FAIL");

    // Performance remark
    if (percentage >= 90)
        System.out.println("Performance Remark: Excellent Performance");
    else if (percentage >= 80)
        System.out.println("Performance Remark: Very Good Performance");
    else if (percentage >= 70)
        System.out.println("Performance Remark: Good Performance");
    else if (percentage >= 60)
        System.out.println("Performance Remark: Average Performance");
    else if (percentage >= 50)
        System.out.println("Performance Remark: Satisfactory Performance");
    else
        System.out.println("Performance Remark: Needs Improvement");
}

public static void main(String[] args) {

    // Marks of five subjects
    int[] marks = {85, 92, 78, 88, 95};

    // Create Student object
    Student student = new Student(101, "  Sita ", marks);

    // Display performance report
    student.displayDetails();
}
}
	


