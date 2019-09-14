package pl.sda.advisor_calendar.model.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.advisor_calendar.model.bank.address.AddressDTO;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import pl.sda.advisor_calendar.model.bank.city.CityDTO;
import pl.sda.advisor_calendar.model.bank.city.CityEntity;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeDTO;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitle;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleDTO;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleEntity;
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

    public List<ProvinceDTO> findByProvice(String province){
        return departmentRepository.findDistinctByProvinceOrderByProvinceAsc(province)
                .stream()
                .map(ProvinceEntity::toDto)
                .collect(Collectors.toList());
    }

//    public List<CityDTO> findByCity(String city){
//        return departmentRepository.findByCity(city)
//                .stream()
//                .map(CityEntity::toDto)
//                .collect(Collectors.toList());
//    }
//
//    public List<AddressDTO> findByAddress(String address) {
//        return departmentRepository.findByAddress(address)
//                .stream()
//                .map(AddressEntity::toDto)
//                .collect(Collectors.toList());
//    }
//    public List<JobTitleDTO> findBySpecialization(String specjalization) {
//        return departmentRepository.findByJobTitle(specjalization)
//                .stream()
//                .map(JobTitleEntity::toDto)
//                .collect(Collectors.toList());
//    }

//    public List<EmployeeDTO> findByEmoloyee(String employee) {
//        return departmentRepository.findByName(employee)
//                .stream()
//                .map(EmployeeEntity::toDto)
//                .collect(Collectors.toList());
//    }
}
