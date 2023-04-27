package ru.masaviktoria.befine.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

}