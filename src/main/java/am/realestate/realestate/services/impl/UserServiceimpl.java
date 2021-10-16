package am.realestate.realestate.services.impl;

import am.realestate.realestate.model.User;

import java.util.List;

public interface UserServiceimpl {
    User getById(int id);

    void save(User user);

    void delete(int id);

    List<User> getAllUsers();
}
