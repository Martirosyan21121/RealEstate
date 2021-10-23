package am.realestate.realestate.repasitpres;

import am.realestate.realestate.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
   List<Comment> findAllByHome_Id(int id);

    Optional  <Comment> findByHome_Id(int id);
}
