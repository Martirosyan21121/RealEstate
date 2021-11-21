package am.realestate.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }


    @GetMapping("/homes")
    public String homes(){
        return "homes";
    }


    @GetMapping("/blogdetail")
    public String blogdetail(){
        return "blogdetail";
    }



    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/property-detail")
    public String propertydetail(){
        return "property-detail";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    }

