package am.realestate.realestate.controller;

import am.realestate.realestate.model.User;
import am.realestate.realestate.model.UserType;
import am.realestate.realestate.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/user")
    public String user() {
        return "index";
    }


    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user){
        user.setUserType(UserType.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/user";
    }
}

