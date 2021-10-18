package am.realestate.realestate.repasitpres;

import am.realestate.realestate.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
