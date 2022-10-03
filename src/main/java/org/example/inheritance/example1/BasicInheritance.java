package org.example.inheritance.example1;

public class BasicInheritance {

    public static void main(String[] args) {

        Car car = new Car();
        car.printInfo();


        Car car1 = new Car("Dodge",200.0f);
        car1.printInfo();

        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();

        SuperCar superCar = new SuperCar();
        superCar.printInfo();
        superCar.setMode();

    }
}
