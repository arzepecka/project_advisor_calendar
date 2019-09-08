package pl.sda.advisor_calendar.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.advisor_calendar.model.bank.DepartmentEntity;

public interface DepartmentProvinceRepository extends JpaRepository<DepartmentEntity, Long> {

    DepartmentEntity findDistinctByProvinceOrderByProvinceAsc(String searchProvince);
}
