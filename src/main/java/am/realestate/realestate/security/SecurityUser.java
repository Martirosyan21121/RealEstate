package am.realestate.realestate.security;

import am.realestate.realestate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;

public class SecurityUser extends org.springframework.security.core.userdetails.User {

    @Autowired
private am.realestate.realestate.model.User user;

    public SecurityUser(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user = user;
    }

    public am.realestate.realestate.model.User getUser() {
        return user;
    }


}
