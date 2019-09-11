package pl.sda.advisor_calendar.model.bank;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;


    @GetMapping("get/{province}")
    ModelAndView getProvince(@PathVariable String province){
        ModelAndView modelAndView = new ModelAndView("employeeForm.html");
        modelAndView.addObject("province", province);
        modelAndView.addObject("departments", departmentService.findByPrivace(province));
        return modelAndView;

    }
}
