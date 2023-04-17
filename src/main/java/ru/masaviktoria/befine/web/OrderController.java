package ru.masaviktoria.befine.web;

import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.OrderService;

@Controller
public class OrderController {

    private OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


}