package CreationalDesignPattren.biulder.problem1;

public class BurgerBuilder {
    private Burger burger;

    public BurgerBuilder() {
        burger = new Burger();
    }
    public BurgerBuilder addBun(String bun) {
        burger.setBun(bun);
        return this;
    }

    public BurgerBuilder addPatties(String patties) {
        burger.setPatties(patties);
        return this;
    }

    public BurgerBuilder addLettuce(boolean hasLettuce) {
        burger.setLettuce(hasLettuce);
        return this;
    }

    public BurgerBuilder addTomato(boolean hasTomato) {
        burger.setTomato(hasTomato);
        return this;
    }

    public BurgerBuilder addOnion(boolean hasOnion) {
        burger.setOnion(hasOnion);
        return this;
    }

    public BurgerBuilder addCheese(boolean hasCheese) {
        burger.setCheese(hasCheese);
        return this;
    }

    // 🔧 This is your final step
    public Burger build() {
        return burger;
    }
}
