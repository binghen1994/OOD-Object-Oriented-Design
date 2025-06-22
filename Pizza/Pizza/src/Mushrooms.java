public class Mushrooms extends PizzaTopping {
    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.85;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }
}
