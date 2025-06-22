public class Cheese extends PizzaTopping {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }
}
