package am.realestate.realestate.services.impl;

import am.realestate.realestate.model.Message;
import am.realestate.realestate.model.User;

import java.util.List;

public interface MessageServiceimpl {
    Message getById(int id);

    void save(Message message);

    void delete(int id);

    List<Message> getAllMessages();
}
