package multithreading;

/*Task 1: Create Threads (2 ways)
Goal: Understand thread creation & lifecycle.
        Requirements:
Create one thread using Thread class
Create one thread using Runnable
                Print thread name + numbers 1–5
Expected Concepts:
start() vs run()
Thread naming*/

public class ThreadConcept extends  Thread {

    public void  run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread Name (extends Thread): "+Thread.currentThread().getName()+" - "+i);
        }
    }

    public static void main(String[] args) {
        // Creating thread using Thread class
        ThreadConcept thread1 = new ThreadConcept();
       // thread1.setName("Thread-1");
        thread1.start();

        // Creating thread using Runnable interface
        Myrunable myRunnable = new Myrunable();
        Thread thread2 = new Thread(myRunnable);
       // thread2.setName("Thread-2");
        thread2.start();
    }

}

class Myrunable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Thread Name (implements Runnable): "+Thread.currentThread().getName()+" - "+i);
        }

    }



}