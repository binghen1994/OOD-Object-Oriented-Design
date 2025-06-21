import java.time.LocalDate;

public class PaymentService {
    public double calculatePrice(int days, double unitPrice) {
        return days * unitPrice;
    }

    public double calculateFine(LocalDate dueDate, LocalDate returnDate, double dailyFineRate) {
        long daysLate = Math.max(0, java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate));
        return daysLate * dailyFineRate;
    }
}
