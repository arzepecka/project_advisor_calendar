package pl.sda.advisor_calendar.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.advisor_calendar.model.bank.DepartmentService;
import pl.sda.advisor_calendar.model.visit.VisitDTO;

@Controller
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;


    @GetMapping("/get")
    ModelAndView getProvince(@PathVariable String province){
        ModelAndView modelAndView = new ModelAndView("employeeForm.html");
        modelAndView.addObject("province", province);
        modelAndView.addObject("departments", departmentService.findByProvice(province));

        return modelAndView;
    }
    @GetMapping("/create")
    ModelAndView createVisit(){
        ModelAndView modelAndView = new ModelAndView("employeeForm.html");
        modelAndView.addObject("visit", new VisitDTO());
        modelAndView.addObject("province",
                departmentService.findByProvice("province"));
//        modelAndView.addObject("city",
//                departmentService.findByCity("city"));
//        modelAndView.addObject("address",
//                departmentService.findByAddress("address"));
//        modelAndView.addObject("specialization",
//                departmentService.findBySpecialization("specialization"));
//        modelAndView.addObject("employee",
//                departmentService.findByEmoloyee("employee"));

        return modelAndView;
    }
}
