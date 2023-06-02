package org.example.collections.example1lista;

import java.util.ArrayList;
import java.util.Collections;

public class List {


    public static void main(String[] args) {

        String str1 ="Jan";
        String str2 ="Michal";
        String str3 ="Pawel";

        ArrayList<String> arr = new <String>ArrayList();
        arr.add(str1);
        arr.add(str2);
        arr.add(str3);

        arr.add("Oliwia");
        arr.set(2,"PawelPawel");
        System.out.println(arr);
//
//        arr.remove(0);
//        System.out.println(arr);

        System.out.println("--SORTING---");
        Collections.sort(arr);
        for (String s: arr) {
            System.out.println(s);
        }


        System.out.println("--Drugi element z listy--");
        String name = arr.get(1);
        System.out.println(name);
    }
}
