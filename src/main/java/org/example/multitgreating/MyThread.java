package org.example.multitgreating;

public class MyThread extends Thread{


    @Override
    public void run()
    {
        for(int i=10; i>0; i--){
            try {
            System.out.println("Thread1: " +i);

                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread1 is finished");
    }

}
