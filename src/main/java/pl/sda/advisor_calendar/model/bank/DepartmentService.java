package pl.sda.advisor_calendar.model.bank;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.advisor_calendar.model.bank.address.AddressDTO;
import pl.sda.advisor_calendar.model.bank.address.AddressEntity;
import pl.sda.advisor_calendar.model.bank.address.AddressRepository;
import pl.sda.advisor_calendar.model.bank.city.CityDTO;
import pl.sda.advisor_calendar.model.bank.city.CityEntity;
import pl.sda.advisor_calendar.model.bank.city.CityRepository;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeDTO;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeEntity;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeRepository;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleDTO;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleEntity;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleRepository;
import pl.sda.advisor_calendar.model.bank.province.ProvinceDTO;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;
import pl.sda.advisor_calendar.model.bank.province.ProvinceRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DepartmentService {

    private final AddressRepository addressRepository;
    private final ProvinceRepository provinceRepository;
    private final CityRepository cityRepository;
    private final JobTitleRepository jobTitleRepository;
    private final EmployeeRepository employeeRepository;


    public DepartmentService(AddressRepository addressRepository, ProvinceRepository provinceRepository, CityRepository cityRepository, JobTitleRepository jobTitleRepository, EmployeeRepository employeeRepository) {
        this.addressRepository = addressRepository;
        this.provinceRepository = provinceRepository;
        this.cityRepository = cityRepository;
        this.jobTitleRepository = jobTitleRepository;
        this.employeeRepository = employeeRepository;
    }


    public List<ProvinceDTO> findByProvice(String province){
        return provinceRepository.findDistinctByProvinceOrderByProvinceAsc(province)
                .stream()
                .map(ProvinceEntity::toDto)
                .collect(Collectors.toList());
    }

    public List<CityDTO> findByCity(String city){
        return cityRepository.findByCity(city)
                .stream()
                .map(CityEntity::toDto)
                .collect(Collectors.toList());
    }

    public List<AddressDTO> findByAddress(String address) {
        return addressRepository.findByAddress(address)
                .stream()
                .map(AddressEntity::toDto)
                .collect(Collectors.toList());
    }
    public List<JobTitleDTO> findBySpecialization(String specjalization) {
        return jobTitleRepository.findByJobTitle(specjalization)
                .stream()
                .map(JobTitleEntity::toDto)
                .collect(Collectors.toList());
    }

    public List<EmployeeDTO> findByEmoloyee(String employee) {
        return employeeRepository.findByName(employee)
                .stream()
                .map(EmployeeEntity::toDto)
                .collect(Collectors.toList());
    }
}
