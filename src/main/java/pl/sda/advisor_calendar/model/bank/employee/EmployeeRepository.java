package pl.sda.advisor_calendar.model.bank.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    List<EmployeeEntity> findAllByAddressEntity_Id(Long id);
    List<EmployeeEntity> findAllByJobTitleEntity_Id(Long id);
}
