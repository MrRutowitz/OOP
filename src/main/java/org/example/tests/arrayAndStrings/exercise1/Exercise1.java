package org.example.tests.arrayAndStrings.exercise1;


public class Exercise1 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] myArray = {1,2,3,4};

        int[] answerr = solution.productExceptSelf(myArray);

        for(int i=0; i<=answerr.length; i++)
        {
            System.out.print(answerr[i]+ " ");
        }
    }
}
