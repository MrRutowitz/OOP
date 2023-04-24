package org.example.lambda.example1;

public class Main {

    public static void main(String[] args) {

        String name = "Michal";
        char symbol = '#';

        MyInterface myInterface = (x,y) -> {
            System.out.println("Hello World!");
            System.out.println("It is a nice day "+x+y);
        };

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };

        myInterface.message(name,symbol);
        myInterface2.message(name,symbol);

    }

}