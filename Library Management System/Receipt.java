import java.time.LocalDate;

public class Receipt {
    String paymentId;
    LocalDate checkoutDate;
    int lendPeriodDays;
    double unitPrice;

    public Receipt(String paymentId, LocalDate checkoutDate, int lendPeriodDays, double unitPrice) {
        this.paymentId = paymentId;
        this.checkoutDate = checkoutDate;
        this.lendPeriodDays = lendPeriodDays;
        this.unitPrice = unitPrice;
    }
}
