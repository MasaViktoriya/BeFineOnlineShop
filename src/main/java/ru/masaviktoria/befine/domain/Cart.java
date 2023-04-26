package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Cart {

    private Long id;

    private List<Product> productList;

    private LocalDateTime creationDateTime;

    private Customer customer;

    private DeliveryList deliveryList;


    public Cart(List<Product> productList, LocalDateTime creationDateTime, Customer customer, DeliveryList deliveryList) {
        this.productList = productList;
        this.creationDateTime = creationDateTime;
        this.customer = customer;
        this.deliveryList = deliveryList;
    }
}