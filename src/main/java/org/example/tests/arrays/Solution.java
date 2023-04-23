package org.example.tests.arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }


        return insertIndex;
    }

//    public int[] deleteDuplciate(int[] nums) {
//
//        int[] save = new int[nums.length];
//
//        for (int i = 0; i <= nums.length; i++) {
//            if (nums[i] == nums[i + 1]) {
//                save[i] = nums[i];
//            } else {
//                save[i] = nums[i];
//            }
//        }
//
//
//            for(int j=0; j<=save.length; j++)
//            {
//                System.out.print(save[j]+" ");
//            }
//
//        return save;
//    }
}