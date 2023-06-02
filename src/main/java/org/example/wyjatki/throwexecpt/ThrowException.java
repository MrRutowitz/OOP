package org.example.wyjatki.throwexecpt;

public class ThrowException {


    public static void main(String[] args) {

    try {


        int arr[] = {0, 1, 2, 3, 4, 5};
        int a = arr[2];
        int divisor = arr[1];
        int result = a / divisor;
        System.out.println(result);

        if(divisor == 0) throw new ArithmeticException("Dont divide 0");
    }
    catch (ArrayIndexOutOfBoundsException exception){
        exception.printStackTrace();
    }
//    catch (ArithmeticException e)
//    {
//        e.printStackTrace();
//    }
    finally {
        System.out.println("Finally");
    }
        System.out.println("Program continues");
    }
}
