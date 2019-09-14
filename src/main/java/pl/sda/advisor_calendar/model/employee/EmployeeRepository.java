package pl.sda.advisor_calendar.model.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
