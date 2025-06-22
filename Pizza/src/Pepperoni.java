public class Pepperoni implements Pizza{
    @Override
    public String getDescription() {
        return "Pepperoni with";
    }

    @Override
    public double getPrice() {
        return 9.5;
    }
}
