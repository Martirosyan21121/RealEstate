package am.realestate.realestate.controller;

import am.realestate.realestate.dot.Dto;
import am.realestate.realestate.model.User;
import am.realestate.realestate.model.UserType;
import am.realestate.realestate.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/userAdmin8888")
    public String user(ModelMap modelMap) {
        List<User> user = userService.findAll();
        modelMap.addAttribute("users", user);
        return "allUsers";
    }

    @GetMapping("/login")
    public String getlogin(@RequestParam(value = "error", required = false) String error,
                           ModelMap modelMap) {
        modelMap.addAttribute("error", error != null);
        return "index";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user, Dto dto) {
        if (user.getPassword().equals(dto.getPasswordConfig())) {
            user.setUserType(UserType.USER);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userService.save(user);
        } else {
            return "/register";
        }
        return "index";
    }
}

