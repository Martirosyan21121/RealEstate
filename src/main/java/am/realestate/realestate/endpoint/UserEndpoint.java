package am.realestate.realestate.endpoint;

import am.realestate.realestate.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserEndpoint {

    @Autowired
    private UserService userService;
}
