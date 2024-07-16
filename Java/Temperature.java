// Write a Java program to create a class called Temperature with a double attribute value. 
// Create an object and print the temperature value.
//     Example:
//     Class: Temperature
//     Attributes: value
public class Temperature {

    private double temperature;

    public Temperature(double temperature){
        this.temperature = temperature;
    }
    public void showTemperature(){
       System.out.println("The current temperature is: " + temperature);
    }
}
