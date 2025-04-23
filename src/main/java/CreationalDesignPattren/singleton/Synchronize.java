package CreationalDesignPattren.singleton;
public class Synchronize {

    public static  Synchronize lazyInstance;
    private Synchronize(){

    }
    public static Synchronize getLazyInstance(){
        if(lazyInstance==null){
            lazyInstance=  new Synchronize();
        }
        return lazyInstance;
    }

    public synchronized static void main(String[] args) {
        Synchronize synchronize = getLazyInstance();
        Synchronize synchronize1= getLazyInstance();
        System.out.println("object 1"+synchronize);
        System.out.println("object 2"+synchronize1);

    }

}
