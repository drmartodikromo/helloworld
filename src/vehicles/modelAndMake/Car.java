package vehicles.modelAndMake;

public class Car {
    String color;
    int speed;
    String makeAndModel;

    public  Car(){

    }

    public Car(String color, int speed, String makeAndModel) {
        this.color = color;
        this.speed = speed;
        this.makeAndModel = makeAndModel;
    }

    public Car(String color, String makeAndModel, int speed) {
        this.color = color;
    }

    public Car(String color, int speed) {
        this.color = color;
    }

    public void drive() {
        System.out.println("Driving...");
    }
}
