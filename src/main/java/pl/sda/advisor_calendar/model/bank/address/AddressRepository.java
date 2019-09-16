package pl.sda.advisor_calendar.model.bank.address;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import java.util.List;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    List<AddressEntity> findByAddress(String searchAddress);

}
