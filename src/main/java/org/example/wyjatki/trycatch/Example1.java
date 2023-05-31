package org.example.wyjatki.trycatch;

public class Example1 {

    public static void main(String[] args) {



        int arr[] = {1,2,3,4,5};

        try{
            int number = arr[10];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ! ");
        }

        System.out.println("Afterr error program continues");

    }
}
