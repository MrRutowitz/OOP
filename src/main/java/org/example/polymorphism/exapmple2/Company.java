package org.example.polymorphism.exapmple2;

public class Company {

    public static void main(String[] args) {

        Employee employee = new Employee("Adam","Programmer",10000);
        Manager manager = new Manager("Kasia","Team Leader",10000, "R&D");
        Employee employeCeo= new Ceo("Jan", "Prezes",20000,"Board",1000);



        if(employeCeo instanceof Ceo){
            Ceo ceo = (Ceo) employeCeo;
            ceo.signContract();
        }


    }
}
