package org.example.polymorphism.exapmple1;

public class Company {

    public static void main(String[] args) {

        Employee employee = new Employee("Adam","Programmer",10000,160);
        Manager manager = new Manager("Kasia","Team Leader",10000,160, "R&D");
        Ceo ceo = new Ceo("Jan", "Prezes",20000,100,"Board",1000);

        Employee employee1 = manager;
        System.out.println(employee1.getName());


        Manager manager1 = ceo;
        System.out.println(manager1.getHourOfWork());


        Employee person = ceo;
        person.doWork();

        person.printInfo();
        ceo.hireEmployee();

        ceo.signContract();
        ceo.printInfo();

        //employee.printInfo();

        Manager worker = ceo;
        worker.printInfo();
        worker.hireEmployee();
        worker.printInfo();

        Ceo ceo1 = ceo;
        ceo1.goOnBreak();

        Employee employee2 = ceo;
        System.out.println(ceo.getName());
        System.out.println(person.getName());



    }
}
