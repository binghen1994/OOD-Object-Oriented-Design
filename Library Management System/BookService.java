import java.util.HashMap;
import java.util.Map;

public class BookService {
    Map<String, Book> bookDB;
    Map<String, Receipt> receipts;
    PaymentService paymentService;

    public BookService(Map<String, Book> bookDB, PaymentService paymentService) {
        this.bookDB = bookDB;
        this.receipts = new HashMap<>();
        this.paymentService = paymentService;
    }

    public void addBook(Book book) {
        bookDB.put(book.barcode, book);
    }

    public void removeBook(String barcode) {
        bookDB.remove(barcode);
    }

    public Receipt checkout(String bookBarcode, User user, int periodDays) {
        Book book = bookDB.get(bookBarcode);
        if (book == null || !book.isAvailable) {
            throw new IllegalStateException("Book not available");
        }

        book.isAvailable = false;
        book.keptBy = user;
        user.booksCheckedOut.add(book);

        double unitPrice = 1.0; // example
        double price = paymentService.calculatePrice(periodDays, unitPrice);
        Receipt receipt = new Receipt(UUID.randomUUID().toString(), LocalDate.now(), periodDays, unitPrice);

        receipts.put(receipt.paymentId, receipt);
        return receipt;
    }

    public void returnBook(String bookBarcode, User user) {
        Book book = bookDB.get(bookBarcode);
        if (book == null || book.keptBy == null || !book.keptBy.equals(user)) {
            throw new IllegalArgumentException("Return not valid");
        }

        book.isAvailable = true;
        book.keptBy = null;
        user.booksCheckedOut.remove(book);
    }

    public double calculateFine(String bookBarcode, User user, LocalDate actualReturnDate) {
        Book book = bookDB.get(bookBarcode);
        if (book == null || !book.keptBy.equals(user)) {
            return 0.0;
        }
        // Fine calculation is mocked here
        return paymentService.calculateFine(LocalDate.now().minusDays(14), actualReturnDate, 0.5);
    }
}
