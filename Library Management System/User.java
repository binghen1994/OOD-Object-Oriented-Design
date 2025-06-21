import java.util.ArrayList;
import java.util.List;

public class User {
    String userId;
    List<Book> booksCheckedOut;

    public User(String userId) {
        this.userId = userId;
        this.booksCheckedOut = new ArrayList<>();
    }
}
