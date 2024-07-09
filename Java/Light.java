
// Write a Java program to create a class called Light with a boolean attribute isOn. 
// Create an object and print the state of the light.
//     Example:
//     Class: Light
//     Attributes: isOn
public class Light {

    private boolean Light;    

    public void setLights(boolean Light){
        this.Light = Light;
    }
    public void lamp(){
        if(Light == false){
            System.out.println("The lights are turned off ");
        }else {System.out.println("The Lights are turned on");}
    }

    
}
