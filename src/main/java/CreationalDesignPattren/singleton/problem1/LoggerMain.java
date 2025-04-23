package CreationalDesignPattren.singleton.problem1;

public class LoggerMain {
    public static void main(String[] args) {

       Logger logger1 = Logger.logInstance();
       Logger logger2 = Logger.logInstance();
        System.out.println(logger1.equals(logger2));
    }
}
