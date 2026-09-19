package LLD.duckSimmulator;

class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a Mallard Duck");
    }

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.performFly();   // Flying with wings

        duck.flyBehavior = new FlyNoWay();
        duck.performFly();   // Cannot fly

    }
}
