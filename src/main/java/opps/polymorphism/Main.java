package opps.polymorphism;

import java.util.Iterator;

class FastFood {
    public void create() {
        System.out.println("Creating in FastFood class");
    }
}
class Pizza extends FastFood {
    public void create() {
        System.out.println("Creating in Pizza class");
    }
}
public class Main {
    public static void main(String[] args) {
        FastFood fastFood= new FastFood();
        fastFood.create();
        //Dynamic binding
        FastFood pza= new Pizza();
        pza.create();
    }

}