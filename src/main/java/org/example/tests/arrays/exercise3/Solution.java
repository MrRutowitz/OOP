package org.example.tests.arrays.exercise3;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
class Solution {
//    public void rotate(int[] nums, int k) {
//        // speed up the rotation
//        k %= nums.length;
//        int temp, previous;
//        for (int i = 0; i < k; i++) {
//            previous = nums[nums.length - 1];
//            for (int j = 0; j < nums.length; j++) {
//                temp = nums[j];
//                nums[j] = previous;
//                previous = temp;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }


        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);

        }
        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

