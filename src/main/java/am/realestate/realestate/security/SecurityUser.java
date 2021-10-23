package am.realestate.realestate.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {

    @Autowired
    private am.realestate.realestate.model.User user;

    public SecurityUser(am.realestate.realestate.model.User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user = user;
    }

    public am.realestate.realestate.model.User getUser() {
        return user;
    }


}
