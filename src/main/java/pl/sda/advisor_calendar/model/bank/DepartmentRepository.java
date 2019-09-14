package pl.sda.advisor_calendar.model.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import pl.sda.advisor_calendar.model.bank.city.CityEntity;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleEntity;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<ProvinceEntity, Long> {

    List<ProvinceEntity> findDistinctByProvinceOrderByProvinceAsc(String searchProvince);

//    @Query("select city from CityEntity where provinceIsChosen ")
//    List<CityEntity> findByCity(String searchCity);
//
//    @Query("select address from AddressEntity where cityIsChosen ")
//    List<AddressEntity> findByAddress(String searchAddress);
//
//    @Query("select jobTitle from JobTitleEntity where addressIsChosen")
//    List<JobTitleEntity> findByJobTitle(String searchJobTitle);

//    @Query("select lastName from DepartmentEntity where provinceIsChosen ")
//    List<EmployeeEntity> findByName(String searchName);
}
