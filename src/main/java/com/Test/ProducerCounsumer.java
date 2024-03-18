package com.Test;

import java.util.ArrayList;
import java.util.List;

public class ProducerCounsumer {
    private  static List<Integer> list =new ArrayList<>();
    int maxLength=2;

    public static void main(String[] args) {

        ProducerCounsumer producerCounsumer= new ProducerCounsumer();
        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {

                producerCounsumer.producer();

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {

                producerCounsumer.counsumer();

            }
        });
        thread1.start();
        thread2.start();
        thread1.run();


    }

    public  void  producer()
    {
        int x=0;
        System.out.println("Inserting element" +x);
        list.add(x++);
    }

    public  void counsumer()
    {
       int y= list.remove(0);

       System.out.println("Removed Element"+ y);
    }
}
