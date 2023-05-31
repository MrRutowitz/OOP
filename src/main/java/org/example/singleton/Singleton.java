package org.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

    public static void main(String[] args) {

        //       DBConnection connection = new DBConnection();

                String s1 = "AA";
                String s2 = "Bb";

                System.out.println(s1.equals(s2)); //false
                System.out.println(s1.hashCode()); //2112
                System.out.println(s2.hashCode()); //2112


        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,2);
        map.put(3,3);

        System.out.println(map);

    }
}
