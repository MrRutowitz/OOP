package org.example.interfaces.example1;

public interface Flying {

    default void fly()
    {
        System.out.println("Flying!");
    }
}
