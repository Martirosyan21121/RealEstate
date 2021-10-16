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
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String letter;
    @ManyToOne
    @JoinColumn(name = "from_id")
    private User fromUser;
    @ManyToOne
    @JoinColumn(name = "to_id")
    private User toUser;
}
