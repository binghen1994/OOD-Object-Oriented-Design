import java.util.Map;

public class Payment {
    private Map<String, Integer> prices;

    public Payment(Map<String, Integer> prices) {
        this.prices = prices;
    }

    public int getPrice(Ticket ticketNum) {
        int unitPrice = this.prices.get(ticketNum.getVehicleType());
        return unitPrice * ticketNum.getDuration();
    }
}
