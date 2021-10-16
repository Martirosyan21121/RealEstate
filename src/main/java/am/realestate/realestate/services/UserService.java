package am.realestate.realestate.services;

import am.realestate.realestate.model.User;
import am.realestate.realestate.services.impl.UserServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceimpl {


    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
