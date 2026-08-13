package javacore;

//Parent class
class Vehicle1 {
 void start() {
     System.out.println("The vehicle starts moving.");
 }
}

//Child class
class Car extends Vehicle1 {
 @Override
 void start() {
     System.out.println("The car engine roars to life.");
 }
}

public class Vehicle{
 public static void main(String[] args) {
     Vehicle1 myVehicle = new Vehicle1();
     Car myCar = new Car();

     myVehicle.start(); // Runs vehicle1
     myCar.start();     // Runs car
 }
}
