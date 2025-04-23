package CreationalDesignPattren.singleton;

public class DoubleLocking {

    public static DoubleLocking doubleLockingInstance;

    private DoubleLocking(){

    }
    private static DoubleLocking createInstance(){
        if(doubleLockingInstance==null){
            synchronized (DoubleLocking.class){
                if(doubleLockingInstance==null){
                    doubleLockingInstance=new DoubleLocking();
                }
            }
        }
        return doubleLockingInstance;
    }

    public static void main(String[] args) {
        DoubleLocking doubleLocking= DoubleLocking.createInstance();
        DoubleLocking doubleLocking1= DoubleLocking.createInstance();
        System.out.println(doubleLocking);
        System.out.println(doubleLocking);

    }
}
