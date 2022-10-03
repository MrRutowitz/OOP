package org.example.final_this;

public class Truck {

    String producer;
    String model;
    int wheels;
    String color;
    int TOP_SPEED = 100;
    int acceleration;


    Truck(){
        producer = "Freightliner";
        model = "9664";
        wheels = 6;

    }

    Truck(String color){
        this();
        this.color = color;

    }


    public void printinfo(){
        System.out.println(model+" "+producer+" "+color);
    }
}
