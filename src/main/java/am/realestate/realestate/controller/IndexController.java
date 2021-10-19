package am.realestate.realestate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/buy")
    public String buy(){
        return "buy";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/properties")
    public String properties(){
        return "properties";
    }
    @GetMapping("/rent")
    public String rent(){
        return "rent";
    }
}
