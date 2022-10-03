package org.example.wartoscreferencjaExercise;

public class CarFactory {

    public Car buildCar(){

        String colors[] = {"black","white","red"};
        int randIndex = (int)(Math.random()*colors.length);
        String randColor = colors[randIndex];
        return new Car("Ford", "Mustang", randColor);


    }



}
