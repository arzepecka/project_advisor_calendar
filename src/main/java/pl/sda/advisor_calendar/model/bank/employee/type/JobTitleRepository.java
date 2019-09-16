package pl.sda.advisor_calendar.model.bank.employee.type;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobTitleRepository extends JpaRepository<JobTitleEntity, Long> {

    List<JobTitleEntity> findByJobTitle(String searchJobTitle);
}
