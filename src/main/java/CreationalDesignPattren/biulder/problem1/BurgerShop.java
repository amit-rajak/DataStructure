package CreationalDesignPattren.biulder.problem1;

public class BurgerShop {
    public static void main(String[] args) {
        Burger myBurger = new BurgerBuilder()
                .addBun("Sesame")
                .addPatties("2x Beef Patties")
                .addLettuce(true)
                .addTomato(true)
                .addOnion(false)
                .addCheese(true)
                .build();  // 🍔 Your burger is ready

        myBurger.showBurger();
    }
}
