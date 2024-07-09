// Write a Java program to create a class called Car with attributes make and model. 
// Create an object of the class and print the attribute values.
//     Example:
//     Class: Car
//     Attributes: make, model
//     Methods: -

public class Car{
    private String make;
    private String model;
    private String colour;
    private int year;


    public Car(String make, String model, String colour, int year) {
       this.make = make;
       this.model = model;
       this.colour = colour;
       this.year = year;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Year: " + year);
    }

}