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
    @Column(name = "imie")
    private String name;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "numer_telefonu")
    private Long phoneNumber;
    @Column(name = "email")
    private String email;


}
