// Write a Java program to create a class called Grade with a char attribute letter.
//  Create an object and print the grade.
//     Example:
//     Class: Grade
//     Attributes: letter

public class Grade {

    private char Grade;
    private String Name;

    public Grade(String Name, char Grade) {
        this.Name = Name;
        this.Grade = Grade;
    }

    public void showGrades() {
        System.out.println("Student name: " + Name);
        System.out.println("Grade: " + Character.toUpperCase(Grade));
    }
}
