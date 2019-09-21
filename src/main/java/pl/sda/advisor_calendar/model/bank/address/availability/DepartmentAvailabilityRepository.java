package pl.sda.advisor_calendar.model.bank.address.availability;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentAvailabilityRepository extends JpaRepository<DepartmentAvailabilityEntity, Long> {


}
