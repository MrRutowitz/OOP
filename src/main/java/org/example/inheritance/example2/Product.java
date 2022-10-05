package org.example.inheritance.example2;

public class Product {

    private String name;




    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
