
import java.util.Arrays;

// Write a Java program to create a class called Student with attributes name and an array of grades. 
// Create an object and print the details.
//     Example:
//     Class: Student
//     Attributes: name, grades (int[])
public class Student {
private String name;
private double [] grades;

public void setName(String name) {
    this.name = name;
}

public void getName() {
    System.out.println(name);
}

public void setgrades(double [] grades) {
    this.grades = grades;
}

public void getGrades() {
    System.out.println("Your grades are: " + Arrays.toString(grades));
}

}
