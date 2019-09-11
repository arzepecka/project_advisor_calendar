package pl.sda.advisor_calendar.model.employee;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.advisor_calendar.model.user.UserEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private List<EmployeeDTO> getAll(){
        return employeeRepository.findAll().stream()
                .map(e-> new EmployeeDTO(e.getDepartmentEntity().getProvince(),
                        e.getDepartmentEntity().getCity(),
                        e.getDepartmentEntity().getAddress(),
                        e.getJobTitle(),
                        e.getName(), e.getLastName())).collect(Collectors.toList());
    }

}
