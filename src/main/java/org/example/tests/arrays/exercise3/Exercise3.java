package org.example.tests.arrays.exercise3;


//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

//Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class Exercise3 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {7,1,5,3,6,4};

        solution.rotate(nums,3);






    }



}
