package ru.masaviktoria.befine.web;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.CartService;

@Controller
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


}