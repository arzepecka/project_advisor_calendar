package pl.sda.advisor_calendar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.advisor_calendar.model.user.UserDTO;

@Controller
class MainViewController {

    @RequestMapping("/")
    ModelAndView mainView() {
        ModelAndView mav = new ModelAndView("index.html");
        mav.addObject(new UserDTO());

        return mav;
    }
}
