package org.example.multitgreating;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{


    @Override
    public void run()
    {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Thread2: " + i);
                sleep(1000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Thread2 is finished");
    }
}
