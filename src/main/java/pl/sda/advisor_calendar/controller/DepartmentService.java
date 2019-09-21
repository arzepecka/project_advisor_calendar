package pl.sda.advisor_calendar.controller;

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

    private final ProvinceRepository provinceRepository;
    private final CityRepository cityRepository;
    private final AddressRepository addressRepository;
    private final JobTitleRepository jobTitleRepository;
    private final EmployeeRepository employeeRepository;

    public DepartmentService(ProvinceRepository provinceRepository, CityRepository cityRepository, AddressRepository addressRepository, JobTitleRepository jobTitleRepository, EmployeeRepository employeeRepository) {
        this.provinceRepository = provinceRepository;
        this.cityRepository = cityRepository;
        this.addressRepository = addressRepository;
        this.jobTitleRepository = jobTitleRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<ProvinceDTO> findByProvince(){
        return provinceRepository.findAll()
                .stream()
                .map(ProvinceEntity::toDto)
                .collect(Collectors.toList());
    }

    public List<CityDTO> findByCity(String city){
        return cityRepository.findAllByProvinceEntity_Id(1l)
                .stream()
                .map(CityEntity::toDto)
                .collect(Collectors.toList());
    }

    public List<AddressDTO> findByAddress(String address) {
        return addressRepository.findAllByCityEntity_Id(1l)
                .stream()
                .map(AddressEntity::toDto)
                .collect(Collectors.toList());
    }
//    public List<JobTitleDTO> findByJobTitle(String jobTitle) {
//        return jobTitleRepository.findDistinctByAddressEntity_Id(1l)
//                .stream()
//                .map(JobTitleEntity::toDto)
//                .collect(Collectors.toList());
//    }

    public List<EmployeeDTO> findByEmployee(Long id) {
        return employeeRepository.findAllByAddressEntity_Id(1l)
                .stream()
                .map(EmployeeEntity::toDto)
                .collect(Collectors.toList());
    }
}
