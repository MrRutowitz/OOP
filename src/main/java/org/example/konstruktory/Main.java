package org.example.konstruktory;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski", "Wroclaw", 22);
        student.printBasicData();


        Student student1 = new Student();
        student1.name = "John";
        student1.surname = "Snow";
        student1.city = "North";
        student1.age = 39;
        student1.printBasicData();


        Student student2 = new Student();
        student2.printBasicData();



    }
}
