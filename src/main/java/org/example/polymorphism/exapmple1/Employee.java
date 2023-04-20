package org.example.polymorphism.exapmple1;

public class Employee {

    private String name;
    private String jobTitle;
    private int salary;

    private int hourOfWork;

    public int getHourOfWork() {
        return hourOfWork;
    }

    public void setHourOfWork(int hourOfWork) {
        this.hourOfWork = hourOfWork;
    }

    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
        hourOfWork = 160;
    }

    public Employee(String name, String jobTitle, int salary, int hourOfWork) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hourOfWork = hourOfWork;
    }


    public void printInfo(){
        System.out.println("Employee: "+ name);
    }

    public void doWork(){
        System.out.println("Doing work!");
    }

    public void goOnBreak(){
        System.out.println("It is time for break!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
