package ru.masaviktoria.befine.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ConsultantService;

@Controller
@RequiredArgsConstructor
public class ConsultantController {

    private final ConsultantService consultantService;

}