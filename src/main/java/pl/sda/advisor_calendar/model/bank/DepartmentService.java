package pl.sda.advisor_calendar.model.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.advisor_calendar.model.bank.province.ProvinceDTO;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<ProvinceDTO> findByPrivace(String province){
        return departmentRepository.findDistinctByProvinceOrderByProvinceAsc(province)
                .stream()
                .map(ProvinceEntity::toDto)
                .collect(Collectors.toList());
    }
}
