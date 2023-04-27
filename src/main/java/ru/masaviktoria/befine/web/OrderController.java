package ru.masaviktoria.befine.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.OrderService;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

}