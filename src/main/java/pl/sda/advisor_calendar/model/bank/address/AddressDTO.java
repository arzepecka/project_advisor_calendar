package pl.sda.advisor_calendar.model.bank.address;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AddressDTO {

    private Long id;
    private String address;
}