package ru.masaviktoria.befine.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.CustomerService;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

}