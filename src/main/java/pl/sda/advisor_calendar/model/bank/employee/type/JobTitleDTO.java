package pl.sda.advisor_calendar.model.bank.employee.type;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class JobTitleDTO {

    private Long id;
    private String jobTitle;
}