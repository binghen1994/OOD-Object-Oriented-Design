public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();Pizza customPizza = new Mushrooms(
                new Olives(
                        new Cheese(
                                new Pepperoni()
                        )
                )
        );

        System.out.println("Your order: " + customPizza.getDescription());
    }
}