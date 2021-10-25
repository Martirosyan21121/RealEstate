package am.realestate.realestate;

import am.realestate.realestate.model.User;
import am.realestate.realestate.model.UserType;
import am.realestate.realestate.repasitpres.HomeRepository;
import am.realestate.realestate.repasitpres.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RealEstateApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(RealEstateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (!userRepository.findByEmail("admin@admin").isPresent()) {
            userRepository.save(User.builder()
                    .email("admin@admin")
                    .phoneNumber(077113162)
                    .surname("admin")
                    .name("admin")
                    .password(passwordEncoder.encode("admin2021"))
                    .userType(UserType.ADMIN)
                    .build());
        }
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
