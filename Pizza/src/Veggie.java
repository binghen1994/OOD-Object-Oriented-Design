public class Veggie implements Pizza{
    @Override
    public String getDescription() {
        return "Veggie with";
    }

    @Override
    public double getPrice() {
        return 9.0;
    }
}
