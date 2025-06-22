public class PizzaTopping implements Pizza {
    protected  Pizza pizza;
    public PizzaTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
