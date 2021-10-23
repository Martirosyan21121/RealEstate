package am.realestate.realestate.services;


import am.realestate.realestate.model.Comment;
import am.realestate.realestate.repasitpres.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllCommentsByHomeId(int id){
        return commentRepository.findAllByHome_Id(id);

    }
    private Comment save(Comment comment){
        Optional<Comment> comment1 = commentRepository.findByHome_Id(comment.getHome().getId());
        if (comment1.isPresent()){
            return comment1.get();
        }
        comment.setHome(comment.getHome());
        return commentRepository.save(comment);
    }
    public boolean deleteById(int id){
        Optional<Comment> deleteById = commentRepository.findById(id);
        if (deleteById.isEmpty()){
            log.info("not deleted");
            return false;
        }
        commentRepository.deleteById(id);
        return true;
    }
}
