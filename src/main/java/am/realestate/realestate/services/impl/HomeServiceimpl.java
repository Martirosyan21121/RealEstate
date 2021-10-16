package am.realestate.realestate.services.impl;

import am.realestate.realestate.model.Home;
import am.realestate.realestate.model.User;

import java.util.List;

public interface HomeServiceimpl {
    Home getById(int id);

    void save(Home home);

    void delete(int id);

    List<Home> getAllHomes();
}
