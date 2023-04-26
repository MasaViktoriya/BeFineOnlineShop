package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.dto.ProductDTO;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
public class Product {

    private Long productId;
    private String title;
    private Integer price;
    private Set<Category> categories = new HashSet<>();
    private String description;
    private Class<? extends Product>  productTypeWithParameters;


    public Product(String title, Integer price, Set<Category> categories, String description, Class<? extends Product> productTypeWithParameters) {
        this.title = title;
        this.price = price;
        this.categories = categories;
        this.description = description;
        this.productTypeWithParameters = productTypeWithParameters;
    }

    public Product(ProductDTO productDTO) {
        this.productId = productDTO.getProductId();
        this.title = productDTO.getTitle();
        this.price = productDTO.getPrice();
        this.categories = productDTO.getCategories();
        this.description = productDTO.getDescription();
        this.productTypeWithParameters = productDTO.getProductTypeWithParameters();
    }
}