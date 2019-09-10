package pl.sda.advisor_calendar.model.bank.employee.type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specjalizacja")
public class JobTitleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "specjalizacja")
    private String jobTitle;

    @OneToMany(mappedBy = "specjalizacja")
    private List<EmployeeEntity> departmentEmployeesList;

    public JobTitleDTO toDto() {
        return JobTitleDTO.builder()
                .id(id)
                .jobTitle(jobTitle)
                .build();
    }
}