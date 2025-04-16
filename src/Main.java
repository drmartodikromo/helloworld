import vehicles.modelAndMake.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}