package pl.sda.advisor_calendar.model.bank.city;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CityDTO {

    private Long id;
    private String city;
}