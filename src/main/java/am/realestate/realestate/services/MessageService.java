package am.realestate.realestate.services;


import am.realestate.realestate.model.Message;
import am.realestate.realestate.repasitpres.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public List<Message> findAll(){
        return messageRepository.findAll();
    }
    public Optional<Message> findById(int id){
        return messageRepository.findById(id);
    }

    public Message save(Message message){
        Optional<Message> message1 = messageRepository.findAllByFromUser_Id(message.getFromUser().getId());
        if (message1.isPresent()){
            return message1.get();
        }
        message.setFromUser(message.getFromUser());
        return messageRepository.save(message);
    }
    public boolean deleteById(int id){
        Optional<Message> deleteById = messageRepository.findById(id);
        if (deleteById.isEmpty()){
            log.info("dont deleted");
            return false;
        }
        messageRepository.deleteById(id);
        return true;
    }
}
