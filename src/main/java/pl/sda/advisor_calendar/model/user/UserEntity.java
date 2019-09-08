package pl.sda.advisor_calendar.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "klient")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "imię")
    private String name;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "numer telefonu")
    private Long phoneNumber;
    @Column(name = "e-mail")
    private String email;


}
