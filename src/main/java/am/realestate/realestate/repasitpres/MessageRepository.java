package am.realestate.realestate.repasitpres;

import am.realestate.realestate.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, Integer> {


    Optional<Message> findAllByFromUser_Id(int id);

}
