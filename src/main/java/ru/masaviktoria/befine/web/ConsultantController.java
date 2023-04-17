package ru.masaviktoria.befine.web;

import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ConsultantService;

@Controller
public class ConsultantController {

    private ConsultantService consultantService;


    public ConsultantController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }


}