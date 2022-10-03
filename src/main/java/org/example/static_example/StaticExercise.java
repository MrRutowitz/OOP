package org.example.static_example;

public class StaticExercise {

    public static void main(String[] args) {



        for(int i =0; i<3; i++){
            Item item = Item.getItem();
            item.printId();

        }

        Item.printNumItems();

    }

}
