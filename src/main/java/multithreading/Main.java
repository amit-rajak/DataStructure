package multithreading;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,4, 10,TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),new CustomRejectedExecutionHandler());

        for(int i=0;i<=7;i++){
            threadPoolExecutor.submit(()->{
                try {
                    Thread.sleep(5000);
                }catch (Exception e){
                    //handle Exception
                }
                System.out.println("task process by" + Thread.currentThread().getName());
            });
        }
    }


}
class  CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread= new Thread(r);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
        return thread;
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("reject handler"+r.toString());
    }
}
