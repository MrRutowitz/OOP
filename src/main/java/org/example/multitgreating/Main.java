package org.example.multitgreating;

public class Main {


    public static void main(String[] args) {


        MyThread myThread1 = new MyThread();

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        myThread1.start();
        thread.start();

    }

}
