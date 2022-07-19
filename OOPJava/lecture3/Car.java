package lecture3;
import java.util.Scanner;

public class Car {
    //Artributes
    private String name;
    private float currentSpeed;
    private float maxSpeed;

    // Constructor
    public Car(String carName,float carMaxSpeed) {
    this.name = carName;
    this.currentSpeed = 0;
    this.maxSpeed = carMaxSpeed;
    }

    // Getters
    public float get_currentSpeed() {
        return this.currentSpeed;
    }

    public float get_maxSpeed() {
        return this.maxSpeed;
    }


    //Methods


// Get from user how much kmh to add, update current speed
    public void accelerate() {
        Scanner addSpeedScanner = new Scanner(System.in);
        float addSpeed = addSpeedScanner.nextFloat();
        currentSpeed += addSpeed;
    }


// If we can get more kmh to max, print it and get from user input how much kmh to add accelerate()
    public void addMoreSpeed() {
        if (currentSpeed < maxSpeed) {
            System.out.println("Your " + this.name + " can do more!" + "\n" + "It's " + this.currentSpeed + " now, you can get more " + kmhToMax() + "\n" + "How much more speed to add?");
            accelerate();
        }else {
            gotMaxSpeedPrint();
        }
    }


// Show how much kmh we have to max speed

    public float kmhToMax() {
        return this.maxSpeed - currentSpeed;
    }


// If we got to the max speed, print it
    public void gotMaxSpeedPrint() {
        System.out.println("wow wow you'r on " + currentSpeed + " now, slow down to" + this.maxSpeed);
    }

}