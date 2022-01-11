package fr.lernejo.travelsite;

import java.util.ArrayList;
import java.util.List;

public class UserMaker {

    public final List<User> userList;
    public UserMaker() {
        userList = new ArrayList<>();
    }
    public User getUser(String userName) {
        for (User user : userList)
            if (user.userName().equalsIgnoreCase(userName))
                return user;
        return null;
    }
    public void add(User user) {
        userList.add(user);
    }
}
