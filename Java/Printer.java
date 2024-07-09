// Write a Java program to create a class called Printer with overloaded methods print to print different types of data.
// Create an object and call the methods.
//     Example:
//     Class: Printer
//     Methods: print(int value), print(String value)
public class Printer {
    public void print(int value){
        System.out.println("Your total cost is: " + value);
    }


    public void print(String value){
        System.out.println("Your Subject to print about is: " + value);
    }
}