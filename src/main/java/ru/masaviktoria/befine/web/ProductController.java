package ru.masaviktoria.befine.web;

import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ProductService;

@Controller
public class ProductController {

    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }


}