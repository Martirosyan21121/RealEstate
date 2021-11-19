package am.realestate.realestate.controller;

import am.realestate.realestate.model.Home;
import am.realestate.realestate.model.User;
import am.realestate.realestate.model.UserType;
import am.realestate.realestate.security.SecurityUser;
import am.realestate.realestate.services.HomeService;
import am.realestate.realestate.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {
    @Autowired
    private HomeService homeService;
    @Autowired
    private UserService userService;


    @GetMapping("/home")
    public String getHome(ModelMap modelMap, @AuthenticationPrincipal SecurityUser securityUser) {
        List<Home> allHomes = homeService.findAll();
        modelMap.addAttribute("homes", allHomes);
        log.info("User with {} username home page, home.size= {}", securityUser.getUser().getEmail(), allHomes.size());
        return "blog";
    }

    @GetMapping("/addHome")
    public String addHome(ModelMap modelMap) {
        List<User> user = userService.findAll();
        modelMap.addAttribute("users", user);
        return "addHome";
    }

    @PostMapping("/addHome")
    public String addHome(@ModelAttribute Home home, User user) {
        home.setUser(User.builder()
                .id(user.getId())
                .build());
        home.setUser(home.getUser());
        homeService.save(home);
        return "redirect:/home";
    }
}
