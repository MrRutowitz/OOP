package org.example.polymorphism.exapmple1;

public class Ceo extends Manager{

    private int sharesNumber;

    public Ceo() {
        sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }


    public void printInfo(){
        System.out.println("Ceo: "+ getName());
    }

    public void signContract(){
        System.out.println("Contract signed");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }
}
