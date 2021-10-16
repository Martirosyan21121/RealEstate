package am.realestate.realestate.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    @JoinColumn(name = "phone_number")
    private int phoneNumber;
    @JoinColumn(name = "pic_url")
    private String picUrl;
    private String password;
    @JoinColumn(name = "user_type")
    private UserType userType;
}
