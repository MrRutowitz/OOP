package org.example.interfaces.example1;

public class Main {

    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly();
        System.out.println(parrot.getNumLegs());
        System.out.println(parrot.getWingspan());


        Flying  flying = parrot;
        flying.fly();


    }
}
