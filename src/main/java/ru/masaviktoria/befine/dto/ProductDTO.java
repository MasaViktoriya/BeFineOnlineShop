package ru.masaviktoria.befine.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.Category;
import ru.masaviktoria.befine.domain.Option;
import ru.masaviktoria.befine.domain.Product;
import ru.masaviktoria.befine.domain.Review;

import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {

    private Long productId;
    private String title;
    private String description;
    private Integer price;
    private Set<Category> categories;
    private List<Review> reviewList;
    private String deliveryType;
    private Integer duration;
    private Long consultantId;
    private List<Option> optionList;
    private String size;
    private BigDecimal weight;
    private String producer;
    private Boolean isPrescriptionRequired;
    private Class<? extends Product> productTypeWithParameters;


    public ProductDTO(Product product) {
        this.productId = product.getProductId();
        this.title = product.getTitle();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.categories = product.getCategories();
        this.productTypeWithParameters = product.getProductTypeWithParameters();
        this.deliveryType = deliveryType;
        this.duration = duration;
        this.consultantId = consultantId;
        this.optionList = optionList;
        this.size = size;
        this.weight = weight;
        this.producer = producer;
        this.isPrescriptionRequired = isPrescriptionRequired;
    }

    public ProductDTO(Long productId, String title, String description, Integer price, Set<Category> categories, Class<? extends Product> productTypeWithParameters, List<Review> reviewList, String deliveryType, Integer duration, Long consultantId, List<Option> optionList, String size, BigDecimal weight, String producer, Boolean isPrescriptionRequired) {
        this.productId = productId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.categories = categories;
        this.productTypeWithParameters = productTypeWithParameters;
        this.reviewList = reviewList;
        this.deliveryType = deliveryType;
        this.duration = duration;
        this.consultantId = consultantId;
        this.optionList = optionList;
        this.size = size;
        this.weight = weight;
        this.producer = producer;
        this.isPrescriptionRequired = isPrescriptionRequired;
    }
}