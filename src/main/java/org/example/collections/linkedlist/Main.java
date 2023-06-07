package org.example.collections.linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("E");


        linkedList.add(0,"D");

        //linkedList.pop();
        // linkedList.poll();

        System.out.println(linkedList);
    }
}
