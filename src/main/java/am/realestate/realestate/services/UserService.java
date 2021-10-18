package am.realestate.realestate.services;

import am.realestate.realestate.model.User;
import am.realestate.realestate.model.UserType;
import am.realestate.realestate.repasitpres.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        Optional<User> byEmail = userRepository.findByEmail(user.getEmail());
        if (byEmail.isPresent()) {
            log.info("User by email " + user.getEmail() + "Dont save please repeating");
            return null;
        }
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        Optional<User> byId = userRepository.findById(user.getId());
        if (byId.isEmpty()) {
            log.info("Don't update: wrong ID");
            return null;
        }
        if (user.getUserType() != UserType.USER && user.getUserType() != UserType.ADMIN) {
            log.info("wrong Role of update's User");
            user.setUserType(byId.get().getUserType());
        }
        return userRepository.save(user);
    }

    public boolean deleteById(int id) {
        Optional<User> byId = userRepository.findById(id);
        if (byId.isEmpty()) {
            log.info("Don't delete: wrong ID");
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }

    public User findByEmail(String email) {
        Optional<User> byEmail = userRepository.findByEmail(email);
        if (byEmail.isEmpty()) {
            return null;
        }
        return byEmail.get();
    }
}
