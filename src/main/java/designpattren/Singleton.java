package designpattren;

public class Singleton {
    private static final long serialVersionUID = 1L;//prevent through serialization
    private static Singleton singleton=null;

    private Singleton(){
        if (singleton != null) {// prevent through reflection
            throw new IllegalStateException("Instance already created");
        }
    }
    private static Singleton createObject(){
        if(singleton==null)
        {
            singleton=new Singleton();
        }
       return singleton;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{// prevent cloneable
        return super.clone();
    }


}
