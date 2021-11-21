package am.realestate.realestate.controller;

import am.realestate.realestate.model.User;
import am.realestate.realestate.services.MessageService;
import am.realestate.realestate.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MessageController {

    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    @GetMapping("/sendMessageForAdmin")
    private String getAllUsers(ModelMap modelMap) {
        List<User> message = userService.findAll();
        modelMap.addAttribute("message", message);
        return "allUsers";
    }

}
