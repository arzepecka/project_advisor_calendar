package pl.sda.advisor_calendar.model.bank.employee.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitleEntity, Long> {

   List<JobTitleEntity> findAllByDepartmentEmployeesList_AddressEntity_id(Long id);
}
