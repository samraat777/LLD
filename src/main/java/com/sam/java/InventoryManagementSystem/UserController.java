package com.sam.java.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users = new ArrayList<>();
    public void addUser(User user)
    {
        users.add(user);
    }

    public void removeUser(User user)
    {
        users.remove(user);
    }
}
