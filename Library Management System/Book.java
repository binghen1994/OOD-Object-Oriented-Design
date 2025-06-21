import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

public class Book {

    String barcode;
    String title;
    String author;
    LocalDate publicationDate;
    String subject;

    boolean isAvailable;
    User keptBy;
    Queue<User> reservationQueue;

    public Book(String barcode, String title, String author, LocalDate publicationDate, String subject) {
        this.barcode = barcode;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.subject = subject;
        this.isAvailable = true;
        this.keptBy = null;
        this.reservationQueue = new LinkedList<>();
        }

}
