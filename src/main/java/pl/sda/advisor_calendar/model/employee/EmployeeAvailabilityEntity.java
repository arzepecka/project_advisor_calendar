package pl.sda.advisor_calendar.model.employee;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "dostępnosc_pracownika")
public class EmployeeAvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Instant availableFrom;
    private Instant availableTo;
}
