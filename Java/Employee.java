// Write a Java program to create a class called Employee with private attributes name and salary. 
// Provide public setter and getter methods. Create an object and access the attributes.
//     Example:
//     Class: Employee
//     Attributes: name (private), salary (private)
//     Methods: setName(String name), getName(), setSalary(double salary), getSalary()

public class Employee {

    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getSalary() {
        System.out.println("Salary: " + "$ " + salary);
    }

}
