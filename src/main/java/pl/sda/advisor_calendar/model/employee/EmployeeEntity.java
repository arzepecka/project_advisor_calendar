package pl.sda.advisor_calendar.model.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.DepartmentEntity;

import javax.persistence.*;
import java.util.Set;

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
    @Column(name = "specjalizacja")
    private String jobTitle;
    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    @OneToMany
    private Set<EmployeeAvailabilityEntity> availabilities;

    public EmployeeDTO toDto() {
        return EmployeeDTO.builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .jobTitle(jobTitle)
                .build();
    }
}


