package org.example.wartoscreferencjaExercise;

public class Main {


    public static void main(String[] args) {


        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        car1.printInfo();
        System.out.println("Car1 color: "+ car1.getColor());

    }
}
