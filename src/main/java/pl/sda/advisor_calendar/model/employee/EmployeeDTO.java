package pl.sda.advisor_calendar.model.employee;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EmployeeDTO {

    private Long id;
    private String name;
    private String lastName;
    private String jobTitle;
    private String email;

}
