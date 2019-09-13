package pl.sda.advisor_calendar.model.bank.employee;

import lombok.*;
import pl.sda.advisor_calendar.model.bank.DepartmentDTO;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EmployeeDTO{

    private Long id;
    private String name;
    private String lastName;
    private String jobTitle;
    private String email;
    private String province;
    private String city;
    private String address;


    public EmployeeDTO(String province, String city, String address1, String jobTitle, String name, String lastName) {
    }
}
