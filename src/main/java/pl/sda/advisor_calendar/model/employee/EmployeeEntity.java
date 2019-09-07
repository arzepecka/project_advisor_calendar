package pl.sda.advisor_calendar.model.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.DepartmentEntity;

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
    @Column(name = "imię")
    private String name;
    @Column(name = "nazwisko")
    private String lastName;
    @Column(name = "specjalizacja")
    private String jobTitle;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    public EmployeeDTO toDto() {
        return EmployeeDTO.builder()
                .id(id)
                .name(name)
                .lastName(lastName)
                .jobTitle(jobTitle)
                .build();
    }
}


