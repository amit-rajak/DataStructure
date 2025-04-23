package CreationalDesignPattren.singleton;

public class Singleton {

    public  static  Singleton singleton;
    Singleton(){

    }

    public static synchronized Singleton createInstance(){

        if(singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }
}
