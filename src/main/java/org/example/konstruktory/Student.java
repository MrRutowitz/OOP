package org.example.konstruktory;

public class Student {

    String name;
    String surname;
    String city;
    int age;


    public Student(){
        this.name= "Helena";
        this.surname= "Nowak";
        this.city = "Gdansk";
        this.age = 45;
    }
    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }


    public void printBasicData(){
        System.out.println("Dane studenta: "+name+" "+surname+" "+city+" "+age);
    }
}
