package org.example.inheritance.example1;

public class SuperCar extends Car{



    SuperCar(){
        type = "SuperCar";
        topSpeed = 300.0f;
    }

    public void setMode(){
        System.out.println("Sport Mode activated");
    }

}
