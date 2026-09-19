package multithreading;

/*Task 2: Thread Sleep & Join
Goal: Control execution order.
        Requirements:
Thread A prints numbers with sleep(500)
Main thread waits using join()
Print execution order clearly
Concepts Tested:
        Thread.sleep()
join()*/


public class ControlExecutionOrder  extends  Thread{

    public  void run(){
        for (int i=1;i<=5;i++){
            System.out.println(
                    "Thread A: "+i
            );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        ControlExecutionOrder controlExecutionOrder = new ControlExecutionOrder();
        controlExecutionOrder.start();
        try {
            controlExecutionOrder.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e); }
    }

}
