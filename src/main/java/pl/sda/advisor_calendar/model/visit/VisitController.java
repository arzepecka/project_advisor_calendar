package pl.sda.advisor_calendar.model.visit;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/create_visit")
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

//    @PostMapping
//    public VisitDTO add(@RequestBody VisitDTO dto){
//        return visitService.add(dto);
//    }
    @PostMapping("/new")
    public VisitDTO doPost(HttpServletRequest req, HttpServletResponse resp){
        return visitService.doPost(req, resp);
    }


}
