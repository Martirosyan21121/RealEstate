package am.realestate.realestate.services.impl;

import am.realestate.realestate.model.Comment;
import am.realestate.realestate.model.User;

import java.util.List;

public interface CommentServiceimpl {
    Comment getById(int id);

    void save(Comment comment);

    void delete(int id);

    List<Comment> getAllComments();
}
