package CreationalDesignPattren.singleton.problem1;

public class Logger {
    public  static  Logger logger;

    private  Logger(){
        // Prevent instantiation via reflection
        if (logger != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    // double Locking
    public  static Logger logInstance(){
        if(logger==null){//  Quick check
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return  logger;
    }




}
