package CreationalDesignPattren;

import java.lang.reflect.Constructor;

public class SingletonBreakReflection {
    public static void main(String[] args) {
        try {
            //Singleton instanceOne = Singleton.getInstance()
            Singleton instanceTwo = null;

            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (Singleton) constructor.newInstance();
                break;
            }

            //System.out.println(instanceOne.hashCode());
            System.out.println(instanceTwo.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
