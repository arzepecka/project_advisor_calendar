package pl.sda.advisor_calendar.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.advisor_calendar.controller.DepartmentService;
import pl.sda.advisor_calendar.model.user.UserDTO;

@Controller
//@RequestMapping("/create_visit")
@RequiredArgsConstructor
class MainViewController {

    private final DepartmentService departmentService;

    @RequestMapping("/")
    ModelAndView mainView() {
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.addObject(new UserDTO());
        modelAndView.addObject("province", departmentService.findByProvince());

        return modelAndView;
    }

}
