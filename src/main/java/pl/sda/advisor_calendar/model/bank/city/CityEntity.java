package pl.sda.advisor_calendar.model.bank.city;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "miejscowosc")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "miejscowosc")
    private String city;

    @ManyToOne()
    @JoinColumn(name = "wojewodztwo")
    private ProvinceEntity provinceEntity;

    @OneToMany(mappedBy = "cityEntity")
    private List<AddressEntity> departmentAddressesList;

    public CityDTO toDto() {
        return CityDTO.builder()
                .id(id)
                .city(city)
                .build();
    }
}
