package pl.sda.advisor_calendar.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.advisor_calendar.model.bank.DepartmentService;
import pl.sda.advisor_calendar.model.bank.address.AddressDTO;
import pl.sda.advisor_calendar.model.bank.city.CityDTO;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeDTO;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleDTO;
import pl.sda.advisor_calendar.model.bank.province.ProvinceDTO;
import pl.sda.advisor_calendar.model.bank.province.ProvinceEntity;
import pl.sda.advisor_calendar.model.bank.province.ProvinceRepository;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/{province}")
    public List<ProvinceDTO> getByProvince(@PathVariable String province){
        return departmentService.findByProvice(province);
    }

    @GetMapping("/{city}")
    public List<CityDTO> getByCity(@PathVariable String city) {
        return departmentService.findByCity(city);
    }

    @GetMapping("/{address}")
    public List<AddressDTO> getByAddress(@PathVariable String address) {
        return departmentService.findByAddress(address);
    }

    @GetMapping("{specialization}")
    public List<JobTitleDTO> getBySpecialization(@PathVariable String jobTitle) {
        return departmentService.findBySpecialization(jobTitle);
    }

    @GetMapping("{employee}")
    public List<EmployeeDTO> getByEmployee(@PathVariable String employee) {
        return departmentService.findByEmoloyee(employee);
    }
}

