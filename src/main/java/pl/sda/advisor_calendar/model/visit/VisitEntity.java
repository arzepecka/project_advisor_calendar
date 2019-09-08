package pl.sda.advisor_calendar.model.visit;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String lastName;
    private Long phoneNumber;
    private String email;
    private String province;
    private String city;
    private String address;
    private Instant availableFrom;
    private Instant availableTo;

    public VisitEntity(Long id, String name, String lastName, String email, Long phoneNumber, String province, String city, String address, Instant availableFrom, Instant availableTo) {
    }
}
