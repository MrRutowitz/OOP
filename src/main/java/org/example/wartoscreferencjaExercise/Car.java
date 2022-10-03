package org.example.wartoscreferencjaExercise;

public class Car {

    String model;
    String brand;
    String color;


    public Car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void printInfo(){
        System.out.println("Twoj samochod: "+model+" "+brand+" "+color);
    }

}
