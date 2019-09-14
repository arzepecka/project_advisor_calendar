package pl.sda.advisor_calendar.model.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<ProvinceEntity, Long> {

    List<ProvinceEntity> findDistinctByProvinceOrderByProvinceAsc(String searchProvince);

//    @Query("select city from DepartmentEntity where provinceIsChosen ")
//    List<DepartmentEntity> findByCity(String searchCity);
//
//    @Query("select address from DepartmentEntity where cityIsChosen ")
//    List<DepartmentEntity> findByAddress(String searchAddress);
//
//    @Query("select jobTitle from DepartmentEntity where addressIsChosen")
//    List<DepartmentEntity> findByJobTitle(String searchJobTitle);
//
//    @Query("select lastName from DepartmentEntity where provinceIsChosen ")
//    List<DepartmentEntity> findByName(String searchName);
}
