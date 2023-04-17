package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Order {

    private Long id;
    private LocalDateTime purchaseDateTime;
    private Boolean isDelivered;
    private Boolean isActive;
    private Boolean isOnReturn;
    private Boolean isCancelled;
    private Boolean isReturned;
    private DeliveryList deliveryList;
    private List<Product> productList;
    private Customer customer;

    public Order() {
    }

    public Order(Customer customer, LocalDateTime purchaseDateTime, Boolean isDelivered, Boolean isActive, Boolean isOnReturn, Boolean isCancelled, Boolean isReturned) {
        this.customer = customer;
        this.purchaseDateTime = purchaseDateTime;
        this.isDelivered = isDelivered;
        this.isActive = isActive;
        this.isOnReturn = isOnReturn;
        this.isCancelled = isCancelled;
        this.isReturned = isReturned;
    }


}