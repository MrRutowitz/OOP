package org.example.tests.arrays.exercise1;


//        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
//        The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//
//        Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
//        The remaining elements of nums are not important as well as the size of nums.
//        Return k.


//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]


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



