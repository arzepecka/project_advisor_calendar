package pl.sda.advisor_calendar.model.bank;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DepartmentDTO {

    private Long id;
    private String province;
    private String city;
    private String address;
    private Instant availableFrom;
    private Instant availableTo;

}

