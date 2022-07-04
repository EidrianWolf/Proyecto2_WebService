package com.web.user.logic;

// @author adr20
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Service {

    private static Service uniqueInstance;

    public static Service instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Service();
        }
        return uniqueInstance;
    }

    HashMap<String, User> users;

    private Service() {
        users = new HashMap<>();
    }

    public User usersCREATE(User user) throws Exception {
        if (users.get(user.getId()) != null) {
            throw new Exception("user ya existe");
        } else {
            users.put(user.getId(), user);
            return user;
        }
    }

    public List<User> usersREAD() {
        return new ArrayList(users.values());
    }

    public User usersREAD(String id) throws Exception {
        if (users.get(id) != null) {
            return users.get(id);
        } else {
            throw new Exception("user no existe");
        }
    }

    public void usersUPDATE(User user) throws Exception {
        System.out.println(user.toString());
        if (users.get(user.getId()) == null) {
            throw new Exception("user no existe");
        } else {
            users.put(user.getId(), user);
        }
    }

    public void usersDELETE(String id) throws Exception {
        if (users.get(id) == null) {
            throw new Exception("user no existe");
        } else {
            users.remove(id);
        }
    }
    
}
