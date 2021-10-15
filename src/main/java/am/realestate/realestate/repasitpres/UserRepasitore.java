package am.realestate.realestate.repasitpres;

import am.realestate.realestate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepasitore extends JpaRepository<User, Integer> {
}
