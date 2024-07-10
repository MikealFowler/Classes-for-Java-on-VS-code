// Write a Java program to create a class called Event with attributes name and date. 
// Create an object and print the event details.
//     Example:
//     Class: Event
//     Attributes: name, date (String)
public class Event {
    private String name;
    private String date;

    public Event(String name, String date){
        this.name = name;
        this.date = date;
    }
    public void printDetails() {
        System.out.println("Event Name: " + name);
        System.out.println("Event Date: " + date);
    }

}
