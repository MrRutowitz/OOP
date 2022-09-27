package org.example.samochod;

public class Car {

    String manufacturer;
    String name;
    String color;
    float topSpeed;


    public float getTopSpeed(){
        return topSpeed;
    }

    public void printInfo(){
        System.out.println(manufacturer+" "+name);
    }
}
