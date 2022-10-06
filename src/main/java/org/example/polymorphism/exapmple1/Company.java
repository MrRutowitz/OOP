package org.example.polymorphism.exapmple1;

public class Company {

    public static void main(String[] args) {

        Employee employee = new Employee("Adam","Programmer",10000);
        Manager manager = new Manager("Kasia","Team Leader",10000, "R&D");
        Ceo ceo = new Ceo("Jan", "Prezes",20000,"Board",1000);

        Employee person = ceo;
        person.doWork();

        person.printInfo();

        ceo.signContract();
        ceo.printInfo();

        employee.printInfo();

        Manager worker = ceo;
        worker.printInfo();
        worker.hireEmployee();
        worker.printInfo();



    }
}
