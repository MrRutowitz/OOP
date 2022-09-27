package org.example.samochod;

public class Main {
    public static void main(String[] args) {


        Car mustang = new Car();
        mustang.manufacturer = "Ford";
        mustang.name = "MustangGT";
        mustang.topSpeed = 290.0f;
        mustang.printInfo();
        System.out.println(mustang.getTopSpeed());


        Car camaro = new Car();
        camaro.manufacturer = "Skoda";
        camaro.name = "oktavia";
        camaro.topSpeed = 300.0f;
        camaro.printInfo();
        System.out.println(camaro.getTopSpeed());
    }
}