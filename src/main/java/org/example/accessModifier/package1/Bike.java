package org.example.accessModifier.package1;

public class Bike {

    private String brand;
    private String name;
    private String type;


    Bike(){

    }

    public Bike(String brand, String name) {
        this.brand = brand;
        this.name = name;
        type = "Bike";
    }

    public void setType(String type) {
        this.type = type;
    }
    public void printInfo(){
        System.out.println("Your Bike: "+ brand+" "+name+" "+type);
    }
}
