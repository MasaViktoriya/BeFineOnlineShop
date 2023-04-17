package ru.masaviktoria.befine.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.CustomerService;

@Controller
public class CustomerController {

    private CustomerService customerService;


    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


}