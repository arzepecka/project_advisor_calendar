package pl.sda.advisor_calendar.model.visit;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class VisitDTO {

    private Long id;
    private String name;
    private String lastName;
    private Long phoneNumber;
    private String email;
    private String province;
    private String city;
    private String address;
    private Instant availableFrom;
    private Instant availableTo;

    public VisitDTO(String name, String lastName, String email, Long phoneNumber, String province, String city, String address, Instant availableFrom, Instant availableTo) {
    }
}
