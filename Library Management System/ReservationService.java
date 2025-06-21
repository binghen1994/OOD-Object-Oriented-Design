public class ReservationService {
    public void addToQueue(Book book, User user) {
        book.reservationQueue.add(user);
    }

    public void removeFromQueue(Book book, User user) {
        book.reservationQueue.remove(user);
    }

    public User getNextInQueue(Book book) {
        return book.reservationQueue.peek();
    }
}
