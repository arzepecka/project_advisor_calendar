package pl.sda.advisor_calendar.model.visit;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "visit")
public class VisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "imie")
    private String name;
    @Column(name = "Nazwisko")
    private String lastName;
    @Column(name = "numer_telefonu")
    private Long phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "wojewodztwo")
    private String province;
    @Column(name = "miasto")
    private String city;
    @Column(name = "adres")
    private String address;
    @Column(name = "otwarty_od")
    private Instant availableFrom;
    @Column(name = "otwarty_do")
    private Instant availableTo;

    public VisitEntity(Long id, String name, String lastName, String email, Long phoneNumber, String province, String city, String address, Instant availableFrom, Instant availableTo) {
    }
}
