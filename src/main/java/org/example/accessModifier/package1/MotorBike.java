package org.example.accessModifier.package1;

public class MotorBike extends Bike{

    public MotorBike(String brand, String name) {
        super(brand, name);
        setType("MotorBike");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
