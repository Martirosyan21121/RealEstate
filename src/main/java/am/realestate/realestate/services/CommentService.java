package am.realestate.realestate.services;

import am.realestate.realestate.model.Comment;
import am.realestate.realestate.repasitpres.CommentRepasitore;
import am.realestate.realestate.services.impl.CommentServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService implements CommentServiceimpl {

    @Override
    public Comment getById(int id) {
        return null;
    }

    @Override
    public void save(Comment comment) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Comment> getAllComments() {
        return null;
    }
}
