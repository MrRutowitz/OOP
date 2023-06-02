package org.example.wyjatki.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x i y");
        System.out.println("Podaj x: ");
        double x = scanner.nextInt();
        System.out.println("Podaj y:");
        double y = scanner.nextInt();
        double result = 0;

        
        if(y==0) throw new ArithmeticException("Dont divide by 0");

        y=scanner.nextInt();
        try {
            result = x / y;
         }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(result);



    }
}
