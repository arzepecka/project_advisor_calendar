package pl.sda.advisor_calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.advisor_calendar.model.bank.address.AddressDTO;
import pl.sda.advisor_calendar.model.bank.city.CityDTO;
import pl.sda.advisor_calendar.model.bank.employee.EmployeeDTO;
import pl.sda.advisor_calendar.model.bank.employee.type.JobTitleDTO;
import pl.sda.advisor_calendar.model.bank.province.ProvinceDTO;

import java.util.List;

@RestController
@RequestMapping("/")
public class DepartmentRestController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("province/{province}")
    public List<ProvinceDTO> getByProvince(@PathVariable String province){
        return departmentService.findByProvince();
    }

    @GetMapping("city/{city}")
    public List<CityDTO> getByCity(@PathVariable String city) {
        return departmentService.findByCity(city);
    }

    @GetMapping("address/{address}")
    public List<AddressDTO> getByAddress(@PathVariable String address) {
        return departmentService.findByAddress(address);
    }

//    @GetMapping("jobTitle/{jobTitle}")
//    public List<JobTitleDTO> getByJobTitle(@PathVariable String jobTitle) {
//        return departmentService.findByJobTitle(jobTitle);
//    }

    @GetMapping("/{employee}")
    public List<EmployeeDTO> getByEmployee(@PathVariable String employee) {
        return departmentService.findByEmployee(1l);
    }
}

