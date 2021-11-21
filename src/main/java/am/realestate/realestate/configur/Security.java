package am.realestate.realestate.configur;

import am.realestate.realestate.security.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@RequiredArgsConstructor
public class Security extends WebSecurityConfigurerAdapter {

    private final SecurityService securityService;
    private final PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("index").permitAll()
                .antMatchers("about").permitAll()
                .antMatchers("agents").permitAll()
                .antMatchers("blog").permitAll()
                .antMatchers("blogdetail").permitAll()
                .antMatchers("buysalerent").permitAll()
                .antMatchers("addHome").permitAll()
                .antMatchers("contact").permitAll()
                .antMatchers("contact").permitAll()
                .antMatchers("/addUser").permitAll()
                .antMatchers("property-detail").permitAll()
                .antMatchers(HttpMethod.GET, "/userAdmin8888")
                .hasAnyAuthority("ADMIN")
                .antMatchers(HttpMethod.GET, "/addHome")
                .hasAnyAuthority("USER")
                .antMatchers(HttpMethod.POST, "/login")
                .hasAnyAuthority("USER")
                .and()
                .csrf()
                .disable()
                .logout()
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .and()
                .formLogin();


    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService)
                .passwordEncoder(passwordEncoder);
    }
}
