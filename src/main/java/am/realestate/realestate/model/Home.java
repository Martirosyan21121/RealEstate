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
@Table(name = "home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String state;
    private String city;
    private String address;
    private int rooms;
    private int price;
    private String description;
    @JoinColumn(name = "home_type")
    private HomeType homeType;
    @JoinColumn(name = "pic_url")
    private String picUrl;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
