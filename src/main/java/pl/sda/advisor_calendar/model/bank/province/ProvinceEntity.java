package pl.sda.advisor_calendar.model.bank.province;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.city.CityEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "wojewodztwo")
public class ProvinceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "wojewodztwo")
    private String province;

    @OneToMany(mappedBy = "wojewodztwo")
    private List<CityEntity> departmentCitiesList;

    public ProvinceDTO toDto() {
        return ProvinceDTO.builder()
                .id(id)
                .province(province)
                .build();
    }
}
