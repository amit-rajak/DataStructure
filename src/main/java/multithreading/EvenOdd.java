package multithreading;

//print even numbers and odd numbers using two different threads
public class EvenOdd  implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("Even")){
            for(int i=0;i<=10;i+=2){
                System.out.println("Even Thread: "+i);
            }
        }else if(threadName.equals("Odd")){
            for(int i=1;i<10;i+=2){
                System.out.println("Odd Thread: "+i);
            }
        }
    }

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        Thread evenThread = new Thread(evenOdd);
        Thread oddThread = new Thread(evenOdd);
        evenThread.setName("Even");
        oddThread.setName("Odd");
        evenThread.start();
        oddThread.start();
    }
}
