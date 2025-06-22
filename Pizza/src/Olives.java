public class Olives extends PizzaTopping {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.75;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}
