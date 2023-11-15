package InstapaySystem;
import java.util.List;

import User.*;
public abstract class AuthenticationService {
    protected List<User> users;

    public AuthenticationService(List<User> users) {
        this.users = users;
    }

    public abstract void SignUp();

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

