package am.realestate.realestate.repasitpres;

import am.realestate.realestate.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HomeRepository extends JpaRepository<Home, Integer> {

    Optional<Home> findByAddress(String name);
}
