package org.example.accessModifier;

public class Main {

    public static void main(String[] args) {


        Bike bike = new Bike("HARO","MOUNTAIN");
        bike.setType("BICYCLE");
        bike.printInfo();


        MotorBike motorBike = new MotorBike("MAXIM","ZEUS");
        motorBike.setType("MOTORBICYCLE");
        motorBike.printInfo();
    }
}
