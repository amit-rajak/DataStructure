package CreationalDesignPattren.singleton;

public class Eager {
    public static Eager eagerInstance = new Eager();
    private Eager() {}
    public static Eager getEagerInstance() {
        return eagerInstance;
    }

    public static void main(String[] args) {

        Eager eager= Eager.getEagerInstance();
        System.out.println(eager);

        Eager eager1= Eager.getEagerInstance();
        System.out.println(eager1);



    }
}