package org.example.enumm;

import java.util.Scanner;
import java.util.zip.DataFormatException;


public class Controller {

    public void timetable(DniTygodnia myDay) {

        Scanner scanner1 = new Scanner(System.in);
        DataFormatException dataFormatException = new DataFormatException();



        switch (myDay){
            case MONDAY -> {
                System.out.println("What have to be done on Monday?");
                String day1 = scanner1.next();
                System.out.println(dataFormatException +" MONDAY "+ day1);

                break;
            }
            case TUESDAY -> {
                System.out.println("What have to be done on Tuesday?");
                String day2 = scanner1.next();
                System.out.println(dataFormatException +" TUESDAY "+ day2);
                break;
            }
            case WEDNESDAY -> {
                System.out.println("What have to be done on Wednesday?");
                String day3 = scanner1.next();
                System.out.println(dataFormatException +" WEDNESDAY "+ day3);
                break;
            }
            case THURSDAY -> {
                System.out.println("What have to be done on Thursday?");
                String day4 = scanner1.next();
                System.out.println(dataFormatException +" THURSDAY "+ day4);
                break;
            }
            case FRIDAY -> {
                System.out.println("What have to be done on Friday?");
                String day5 = scanner1.next();
                System.out.println(dataFormatException +" FRIDAY "+ day5);
                break;
            }
            default -> System.out.println("There is not day like this!");
        }
        }

}
