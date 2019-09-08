package pl.sda.advisor_calendar.model.visit;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class VisitService {

    private final VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public VisitDTO add(VisitDTO dto){
        VisitEntity e = mapToVisit(dto);
        e = visitRepository.save(e);

        return mapToDto(e);
    }

    private VisitDTO mapToDto(VisitEntity e) {
        return new VisitDTO(
                e.getName(),
                e.getLastName(),
                e.getEmail(),
                e.getPhoneNumber(),
                e.getProvince(),
                e.getCity(),
                e.getAddress(),
                e.getAvailableFrom(),
                e.getAvailableTo()
        );
    }

    private VisitEntity mapToVisit(VisitDTO dto) {
        return new VisitEntity(
                dto.getName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getPhoneNumber(),
                dto.getProvince(),
                dto.getCity(),
                dto.getAddress(),
                dto.getAvailableFrom(),
                dto.getAvailableTo()
        );
    }
}
