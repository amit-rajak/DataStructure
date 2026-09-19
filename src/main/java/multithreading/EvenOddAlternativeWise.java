package multithreading;

public class EvenOddAlternativeWise  implements  Runnable{

     static int counter=1;
     Object object;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(counter<=10){
            synchronized (object){
                System.out.println("Thread name "+Thread.currentThread().getName()+"value"+counter);



            }
        }

    }

}


