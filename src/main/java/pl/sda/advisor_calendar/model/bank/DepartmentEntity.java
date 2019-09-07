package pl.sda.advisor_calendar.model.bank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.advisor_calendar.model.employee.EmployeeEntity;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oddział banku")
public class DepartmentEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "województwo")
    private String province;
    @Column(name = "miasto")
    private String city;
    @Column(name = "adres")
    private String address;

    @OneToMany(mappedBy = "employees")
    private List<EmployeeEntity> departmentEmployeesList;

    public DepartmentDTO toDto() {
        return DepartmentDTO.builder()
                .id(id)
                .province(province)
                .city(city)
                .address(address)
                .build();
    }
}
