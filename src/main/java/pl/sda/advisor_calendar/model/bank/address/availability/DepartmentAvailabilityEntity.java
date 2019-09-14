package pl.sda.advisor_calendar.model.bank.address.availability;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dotepnosc_oddzialu")
public class DepartmentAvailabilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "czynny_od")
    private OpeningHours openingHours;
    @Column(name = "czynny_do")
    private ClosingHours closingHours;

    @OneToMany(mappedBy = "departmentAvailabilityEntity")
    private Set<AddressEntity> departmentAvailability;
}