package org.example.tests.arrays;

//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]


import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers = {11,8,2,2,46,7};

     //   solution.removeDuplicates(numbers);

        solution.removeDuplicates(numbers);


        for (int n: numbers) {

            System.out.println(n);

        }


    }
}



