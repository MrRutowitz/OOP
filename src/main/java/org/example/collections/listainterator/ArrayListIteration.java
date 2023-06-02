package org.example.collections.listainterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args) {



        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiat", "Punto", 2000));
        cars.add(new Car("Ferrari", "SUPER", 2011));
        cars.add(new Car("BMW", "X5", 2020));


        for(int i=0;i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }


        System.out.println("INTERATOR:");
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

    }
}
