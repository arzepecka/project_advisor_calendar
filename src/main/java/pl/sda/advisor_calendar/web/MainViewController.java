package pl.sda.advisor_calendar.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class MainViewController {

    @RequestMapping
    ModelAndView mainView() {
        ModelAndView mav = new ModelAndView("index.html");
        return mav;
    }
}
