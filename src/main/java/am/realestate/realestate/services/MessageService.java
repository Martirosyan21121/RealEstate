package am.realestate.realestate.services;

import am.realestate.realestate.model.Message;
import am.realestate.realestate.services.impl.MessageServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService implements MessageServiceimpl {
    @Override
    public Message getById(int id) {
        return null;
    }

    @Override
    public void save(Message message) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Message> getAllMessages() {
        return null;
    }
}
