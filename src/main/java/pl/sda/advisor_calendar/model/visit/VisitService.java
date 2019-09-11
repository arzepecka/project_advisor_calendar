package pl.sda.advisor_calendar.model.visit;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@Service
@Transactional
public class VisitService {

    private final VisitRepository visitRepository;

    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

//    public VisitDTO add(VisitDTO dto){
//        VisitEntity e = mapToVisit(dto);
//        e = visitRepository.save(e);
//
//        return mapToDto(e);
//    }

    protected VisitDTO doPost(HttpServletRequest req, HttpServletResponse resp){
        String imie = req.getParameter("imie");
        String nazwisko = req.getParameter("nazwisko");
        Long numer_telefonu = Long.valueOf(req.getParameter("numer_telefonu"));
        String email = req.getParameter("email");

        VisitEntity entity= visitRepository.save(VisitEntity.builder()
                .name(imie)
                .lastName(nazwisko)
                .email(email)
                .phoneNumber(numer_telefonu)
                        .build());

        return mapToDto(entity);
    }

    private VisitDTO mapToDto(VisitEntity e) {
        return new VisitDTO(
                e.getId(),
                e.getName(),
                e.getLastName(),
                e.getEmail(),
                e.getPhoneNumber(),
                e.getProvince(),
                e.getCity(),
                e.getAddress(),
                e.getAvailableFrom(),
                e.getAvailableTo());

    }

    private VisitEntity mapToVisit(VisitDTO dto) {
        return new VisitEntity(
                dto.getId(),
                dto.getName(),
                dto.getLastName(),
                dto.getPhoneNumber(),
                dto.getEmail(),
                dto.getProvince(),
                dto.getCity(),
                dto.getAddress(),
                dto.getAvailableFrom(),
                dto.getAvailableTo()
        );
    }
}
