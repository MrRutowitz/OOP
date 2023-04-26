package org.example.enumm;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.MonthDay;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome in your TIMETABLE");
        System.out.println("Which DAY would you like to check?");

  //      Paths path = Paths.get("/home/erx/Desktop/test.txt");

        DniTygodnia dniTygodnia = DniTygodnia.MONDAY;
        Controller controller = new Controller();

        controller.timetable(DniTygodnia.FRIDAY);






    }


}