package ru.masaviktoria.befine.web;

import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.DeliveryService;

@Controller
public class DeliveryController {

    private DeliveryService deliveryService;


    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }


}