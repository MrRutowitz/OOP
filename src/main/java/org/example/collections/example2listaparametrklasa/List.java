package org.example.collections.example2listaparametrklasa;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Jan","Kowalski",51));
        Employee employee = new Employee("Zbyszek","Nowak", 33);
        employees.add(employee);
        Employee employee1 = new Employee("Damian","Nowak", 33);
        employees.add(employee1);

//        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println( e.toString());
        }


    }
}
