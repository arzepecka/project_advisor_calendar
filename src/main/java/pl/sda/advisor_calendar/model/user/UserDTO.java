package pl.sda.advisor_calendar.model.user;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserDTO {

    private Long id;
    private String name;
    private String lastName;
    private Long phoneNumber;
    private String email;

}
