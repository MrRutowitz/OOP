package org.example.static_example;

public class StaticExample {

    public static void main(String[] args) {

        PlaneWithStatic plane1 = new PlaneWithStatic();
        PlaneWithStatic plane2 = new PlaneWithStatic();
        PlaneWithStatic plane3 = new PlaneWithStatic();

        plane2.nextId = 4;

        plane2.secondId =2;



        System.out.println("plane1.nextId: "+ plane1.nextId);
        System.out.println("plane2.nextId: "+ plane2.secondId);
    }
}
