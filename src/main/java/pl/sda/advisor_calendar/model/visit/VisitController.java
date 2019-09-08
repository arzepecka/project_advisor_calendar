package pl.sda.advisor_calendar.model.visit;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create_visit")
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @PostMapping
    public VisitDTO add(@RequestBody VisitDTO dto){
        return visitService.add(dto);
    }
}
