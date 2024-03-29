package org.example.wyjatki.example1;



class TestException extends Exception{

    public TestException() {
        super("TestException message");
    }

    public TestException(String message) {
        super(message);
    }
}


public class ThrowException {

    public int divide(int number, int divisor) throws ArithmeticException{
        return number/divisor;
    }

    public int test(int number) throws TestException {
        if( 1 == 1) throw new TestException();
        return 1;
    }


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
        catch (ArithmeticException e)
        {
        e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Program continues");


        ThrowException throwException = new ThrowException();
        try{
            throwException.divide(10,0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            throwException.test(12);
        }catch (TestException exception){
            exception.printStackTrace();
        }



    }
}