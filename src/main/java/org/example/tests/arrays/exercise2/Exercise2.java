package org.example.tests.arrays.exercise2;


//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
//        However, you can buy it then immediately sell it on the same day.
//
//        Find and return the maximum profit you can achieve.

//Input: prices = [7,1,5,3,6,4]
//        Output: 7
//
//Input: prices = [1,2,3,4,5]
//        Output: 4

public class Exercise2 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] prices = {7,1,5,3,6,4};

        System.out.println(solution.maxProfit(prices));




    }




}
