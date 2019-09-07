package pl.sda.advisor_calendar.web;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/advisor")
@RequiredArgsConstructor
public class AdvisorController {

    private final static Logger LOGGER = LoggerFactory.getLogger(AdvisorController.class);

    @GetMapping("/get/{specjalization}")
    ModelAndView getAdvisor (@PathVariable String specialization){

        return null;
    }
}
