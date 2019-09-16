package pl.sda.advisor_calendar.model.bank.city;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<CityEntity, Long> {

    List<CityEntity> findByCity(String searchCity);
}
