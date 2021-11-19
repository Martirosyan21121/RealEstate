package am.realestate.realestate.advais;

import am.realestate.realestate.model.User;
import am.realestate.realestate.security.SecurityUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MainAdvice {

    @ModelAttribute("currentUser")
    public User user (@AuthenticationPrincipal SecurityUser securityUser) {
        if (securityUser == null) {
            return new User();
        }
        return securityUser.getUser();
    }
}
