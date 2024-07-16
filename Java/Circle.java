// Write a Java program to create a class called Circle with a default constructor that sets the radius to 1.
//  Create an object and print the radius.
// Example:
// Class: Circle
//  Constructor: Circle()

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayRadius() {
        System.out.println("The Radius is: " + radius);
    }
}