package org.example.accessModifier;

import org.example.accessModifier.package1.Bike;
import org.example.accessModifier.package1.MotorBike;
import org.example.accessModifier.package2.Cross;

public class Main {

    public static void main(String[] args) {


        Bike bike = new Bike("HARO","MOUNTAIN");
        bike.setType("BICYCLE");
        bike.printInfo();


        MotorBike motorBike = new MotorBike("MAXIM","ZEUS");
        motorBike.setType("MOTORBICYCLE");
        motorBike.printInfo();


        Cross cross = new Cross("KTM","RJ90");
        cross.setType("MOTOCROSS");
        cross.printInfo();
    }
}
