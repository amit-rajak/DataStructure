package CreationalDesignPattren.singleton;

public class Lazy {

    public static  Lazy lazyInstance;
    private Lazy(){

    }
    public static Lazy getLazyInstance(){
        if(lazyInstance==null){
          lazyInstance=  new Lazy();
        }
        return lazyInstance;
    }

    public static void main(String[] args) {
        Lazy lazy = getLazyInstance();
        Lazy lazy1= getLazyInstance();
        System.out.println("object 1"+lazy);
        System.out.println("object 2"+lazy1);

    }

}
