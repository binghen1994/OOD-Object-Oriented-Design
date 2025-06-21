import java.util.Map;

public class MemberService {
    Map<String, User> userDB;

    public MemberService(Map<String, User> userDB) {
        this.userDB = userDB;
    }

    public void addMember(User user) {
        userDB.put(user.userId, user);
    }

    public void removeMember(String userId) {
        userDB.remove(userId);
    }
}
