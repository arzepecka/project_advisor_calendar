package pl.sda.advisor_calendar.model.bank.province;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepository extends JpaRepository<ProvinceEntity, Long>  {

    List<ProvinceEntity> findDistinctByProvinceOrderByProvinceAsc(String searchProvince);
}
