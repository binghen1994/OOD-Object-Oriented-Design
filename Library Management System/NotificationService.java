public class NotificationService {
    public void notifyUser(User user, String message) {
        System.out.println("Notify " + user.userId + ": " + message);
    }
}
