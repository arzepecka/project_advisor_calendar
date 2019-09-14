package pl.sda.advisor_calendar.model.bank.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleEntity;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pracownik")
public class EmployeeEntity {


    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "imie")
    private String name;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "adres_oddzialu")
    private AddressEntity addressEntity;

    @ManyToOne
    @JoinColumn(name = "specjalizacja")
    private JobTitleEntity jobTitleEntity;

    public EmployeeDTO toDto() {
        return EmployeeDTO.builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .build();
    }
}


