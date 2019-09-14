package pl.sda.advisor_calendar.model.bank.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.bank.address.availability.DepartmentAvailabilityEntity;
import pl.sda.advisor_calendar.model.bank.city.CityEntity;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adres")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "adres")
    private String address;

    @OneToMany(mappedBy = "addressEntity")
    private List<EmployeeEntity> departmentEmployeesList;

    @ManyToOne()
    @JoinColumn(name = "miejscowosc")
    private CityEntity cityEntity;

    @ManyToOne
    @JoinColumn(name = "dostepnosc_oddzialu")
    private DepartmentAvailabilityEntity departmentAvailabilityEntity;

    public AddressDTO toDto() {
        return AddressDTO.builder()
                .id(id)
                .address(address)
                .build();
    }
}