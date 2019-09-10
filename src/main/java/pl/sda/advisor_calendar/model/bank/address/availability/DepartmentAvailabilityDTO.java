package pl.sda.advisor_calendar.model.bank.address.availability;

import lombok.*;

import java.time.LocalTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DepartmentAvailabilityDTO {

    private Long id;
    private LocalTime availableFrom;
    private LocalTime availableTo;
}
